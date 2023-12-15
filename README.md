
<h1 align="center">
  <br>
<img src="https://i.imgur.com/gDvUkvv.png" alt="Aces High - CS:GO" width="200"></a>
  <br>
  4aces
  <br>
</h1>

<h4 align="center">A 52-card deck simulation built utilizing Java.</h4>

<p align="center">
  <a href="https://github.com/aarcn/4aces/blob/main/LICENSE"><img src="https://img.shields.io/badge/license-MIT-maroon"></a>
  <a href="https://www.ibo.org/programmes/diploma-programme/curriculum/mathematics"><img src="https://img.shields.io/badge/IB-%20Math%20AI%20HL%20-blue"></a>
  <a href="https://ibpublishing.ibo.org/live-exist/rest/app/tsm.xql?doc=d_5_matsl_tsm_1205_1_e&part=1&chapter=8"><img src="https://img.shields.io/badge/Internal%20-%20Assessment-white"></a>
</p>

<p align="center">
  <a href="#background">Background</a> •
  <a href="#purpose">Purpose</a> •
  <a href="#how-to-use">How To Use</a> •
  <a href="#built-with">Built With</a>
</p>

![screenshot](https://i.imgur.com/bKrEigi.png)

## Background

The <b>fourth ace paradox</b> starts by asking the following question...
<br>
<br>
<i>When a standard 52-card deck is shuffled, what is the most likely position that the fourth ace will appear in given that one card is revealed at a time?</i>
<br>
<br>
A prerequisite to keep in mind when trying to come to a logical conclusion is that the fourth ace cannot appear in the first, second, or third position since they cannot be the fourth ace. That being said, if the fourth ace were to appear in the fourth position, then 3 other aces would need to appear in the first, second, and third positions, resulting in a four-of-a-kind being revealed immediately. The odds of this happening are $(4/52 \times\ 3/51 \times\ 2/50 \times\ 1/49) \times\ 100 = 0.00036937852$%. Though, if the fourth ace were to appear in the fifth position, the odds then become $\big((4/52 \times\ 3/51 \times\ 2/50 \times\ 49/49 \times\ 1/48) + (52/52 \times\ 4/51 \times\ 3/50 \times\ 2/49 \times\ 1/48)$ $+ (4/52 \times\ 51/51 \times\ 3/50 \times\ 2/49 \times\ 1/48) + (4/52 \times\ 3/51 \times\ 50/50 \times\ 2/49 \times\ 1/48)\big) \times\ 100 = 0.00155446794$%. The odds seem to increase by over 4 times simply by increasing our position choice by 1. Though, this scalar of 4.2x does not remain constant as we increase the positions we are comparing. When permutations are low, the probability of a specific card being in any specific position is relatively high. Though, as permutations increase the probability of any specific card being in any specific position decreases. This is due to the increasing randomness and variability in the distribution of the cards as permutations increase.


## Purpose

4aces creates <I>n</i> amount of decks utilizing Java arrays, shuffles each integer (card) using the Math.random() method, and locates the <I>x</i>th ace in the deck. This program "brute-forces" the probability behind the fourth ace paradox by creating, shuffling, and parsing any desired amount of decks. 4aces then prints out the most likely position of the <I>x</i>th ace and all the positions that occured with their respective frequencies.


## How To Use

To clone and run this application, you'll need [Git](https://git-scm.com) installed on your computer. From your command line:

```bash
# Clone this repository
$ git clone https://github.com/aarcn/4aces.git

# Go into the repository
$ cd 4aces

# Compile the Java program
$ javac fourAces.java

# Execute the program
$ java fourAces
```

> **Note**
> The amount of 52-card decks simulated is set to 100000 by default. You will need to manually increase the integer value to get better probability results.


## Built With

JAVA
<br>
MIT

---

> [lamar.academy/aaron](https://lamar.academy/aaron) &nbsp;&middot;&nbsp;
> GitHub [@aarcn](https://github.com/aarcn) &nbsp;&middot;&nbsp;
> Instagram [@uum](https://instagram.com/uum)

