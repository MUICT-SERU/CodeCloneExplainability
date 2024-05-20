<div align="center">
  <h1>CodeCloneExplainability</h1>

</div>
This is the repo for Chayanee Junplong master's thesis.

![-----------------------------------------------------](https://raw.githubusercontent.com/rjman-ljm/readme//master/assets/lines/rainbow.png)

## Dataset
### Data : GoogloeCodeJam (Java)
Ref : [https://github.com/parasol-aser/deepsim/tree/master/dataset](https://github.com/parasol-aser/deepsim/tree/master/dataset)

Question for GoogleCodeJam that we use : [Question-GCJ](https://github.com/MUICT-SERU/CodeCloneExplainability/tree/master/Question-GCJ)<br>
Other Question (eg. Code Jam ,Kick Start,Hash Code) : [this web!](https://zibada.guru/gcj/)<br>
Code fragments:  1665 <br>
True clone pairs:  274959<br>
False clone pairs:  1110321

### Data : CodeNet (java)
Ref: [https://developer.ibm.com/exchanges/data/all/project-codenet/
](https://developer.ibm.com/exchanges/data/all/project-codenet/)

Code fragments:  75000<br>
True clone pairs:  11212500<br>
False clone pairs:  2801250000

## Model
Ref :[https://github.com/microsoft/CodeBERT/tree/master](https://github.com/microsoft/CodeBERT/tree/master)
### CodeBERT
CodeBERT is a pre-trained model for programming language, which is a multi-programming-lingual model pre-trained on NL-PL pairs in 6 programming languages (Python, Java, JavaScript, PHP, Ruby, Go).
### GraphCodeBERT
GraphCodeBERT is a pre-trained model for programming language that considers the inherent structure of code i.e. data flow, which is a multi-programming-lingual model pre-trained on NL-PL pairs in 6 programming languages (Python, Java, JavaScript, PHP, Ruby, Go).

We will focus on this for [clone detection](https://github.com/microsoft/CodeBERT/tree/master/GraphCodeBERT/clonedetection)


