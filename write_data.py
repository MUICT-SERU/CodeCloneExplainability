import os
import json
from pathlib import Path
import sys
import random
from itertools import combinations
def print_progress_bar(index, total, label):
    n_bar = 50  # Progress bar width
    progress = index / total
    sys.stdout.write('\r')
    sys.stdout.write(f"[{'=' * int(n_bar * progress):{n_bar}s}] {int(100 * progress)}%  {label}")
    sys.stdout.flush()
path = "C://Users//QRcodekiki//OneDrive - Mahidol University//MS_CS//2T2//ITCS697 THESIS//Thesis//CodeCloneExplainability//Project_CodeNet_Java250//Project_CodeNet_Java250"
# path = "C://Users//QRcodekiki//OneDrive - Mahidol University//MS_CS//2T2//ITCS697 THESIS//Thesis//CodeCloneExplainability//googlejam4//googlejam4_src"
dir_folder = os.listdir(path)
dic_folder_clone = {}

count_function=0
num_clone = 0


with open("data.jsonl", "w") as outfile:
    for x in dir_folder:
        num = 1
        value = []
        count = 1
        for y in  os.listdir(path+"//"+x):
                with open(path+"//"+x+"//"+y, 'r',encoding='cp850') as f:
                    function = str(f.read())
                data= dict(func=function,idx=(str(x).zfill(2)+str(num).zfill(3)))
                json.dump(data, outfile)
                outfile.write('\n')
                value.append((str(x).zfill(2)+str(num).zfill(3)))
                num += 1
                count += 1
                count_function += 1
                print_progress_bar(count, len(os.listdir(path+"//"+x)), "loading.. function in data.jsonl "+x)
        dic_folder_clone[x] =value    
print("\nNumber of function in data.jsonl: ",count_function)

clone_pair = {}
for i in dic_folder_clone:
    comb = combinations(dic_folder_clone[i], 2)
    clone_pair[i] = list(comb)
unclone_pair = []
with open("test.txt", "w") as outfile:
    while(num_clone!=24959):
        # rundom clone 
        key_clone = random.choice(list(clone_pair.keys()))
        clone =  random.choice(list(clone_pair[key_clone]))
        clone_pair[key_clone].remove(clone)
        if len(clone_pair[key_clone]) == 0 :
            clone_pair.pop(key_clone)
        outfile.writelines(clone[0]+"\t"+clone[1]+"\t1\n")
        # rundom not-clone 
        unclone_check = True
        while(unclone_check):
            all_key = list(dic_folder_clone.keys())
            key1 = random.choice(all_key)
            all_key.remove(key1)
            key2 = random.choice(all_key)
            value1 = random.choice(list(dic_folder_clone[key1]))
            value2 = random.choice(list(dic_folder_clone[key2]))
            unclone = [value1,value2]
            unclone.sort()
            if unclone not in unclone_pair:
                outfile.writelines(unclone[0]+"\t"+unclone[1]+"\t0\n")
                unclone_check = False
        print_progress_bar(num_clone, 24959, "loading.. function in test.txt")
        num_clone += 1