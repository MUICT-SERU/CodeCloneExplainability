import os
import json
from pathlib import Path
import sys
import random
from itertools import combinations
from math import comb
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

Code_fragments=0
clone = 0
unclone=0
all=[]


with open("information", "w") as outfile:
    for x in dir_folder:
        Code_fragments += len(os.listdir(path+"//"+x))
        all.append(len(os.listdir(path+"//"+x)))
        clone += comb(len(os.listdir(path+"//"+x)), 2)
    for i in range(0,len(all)):
        count = 0
        for j in range(i+1,len(all)):
            count += all[j]
        unclone += (count*all[i])
        
print("Code fragments: ",Code_fragments)
print("True clone pairs: ",clone)
print("False clone pairs: ",unclone)
print(all)

# outfile.write('\n')
# outfile.writelines(clone[0]+"\t"+clone[1]+"\t1\n")