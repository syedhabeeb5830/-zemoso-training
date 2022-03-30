# zemoso-training
syedU@PF3JLJNX:~/Desktop/ff_merge$ cd ..
syedU@PF3JLJNX:~/Desktop$ cd ff_merge/
syedU@PF3JLJNX:~/Desktop/ff_merge$ git branch
* ff_merge
  master
syedU@PF3JLJNX:~/Desktop/ff_merge$ git log --oneline
959d0d5 (HEAD -> ff_merge, origin/ff_merge, master) created greeting1.txt
syedU@PF3JLJNX:~/Desktop/ff_merge$ git branch greeting
syedU@PF3JLJNX:~/Desktop/ff_merge$ git branch
* ff_merge
  greeting
  master
syedU@PF3JLJNX:~/Desktop/ff_merge$ git switch greeting 
M	greeting1.txt
Switched to branch 'greeting'
syedU@PF3JLJNX:~/Desktop/ff_merge$ touch greeting.txt
syedU@PF3JLJNX:~/Desktop/ff_merge$ git add .
syedU@PF3JLJNX:~/Desktop/ff_merge$ git commit -m "created the greeting file"
[greeting 8784f22] created the greeting file
 2 files changed, 3 insertions(+), 1 deletion(-)
 create mode 100644 greeting.txt
syedU@PF3JLJNX:~/Desktop/ff_merge$ git switch master
Switched to branch 'master'
syedU@PF3JLJNX:~/Desktop/ff_merge$ git log --oneline --graph -all
error: switch `l' expects a numerical value
syedU@PF3JLJNX:~/Desktop/ff_merge$ git log --oneline --graph --all
* 8784f22 (greeting) created the greeting file
* 959d0d5 (HEAD -> master, origin/ff_merge, ff_merge) created greeting1.txt
syedU@PF3JLJNX:~/Desktop/ff_merge$ git diff greeting master
diff --git a/greeting.txt b/greeting.txt
deleted file mode 100644
index 1e57781..0000000
--- a/greeting.txt
+++ /dev/null
@@ -1 +0,0 @@
-hello everyone !
diff --git a/greeting1.txt b/greeting1.txt
index ce394d4..a95200f 100644
--- a/greeting1.txt
+++ b/greeting1.txt
@@ -1,2 +1 @@
-HELLO WORLD !
-
+hello world !
syedU@PF3JLJNX:~/Desktop/ff_merge$ git merge greeting master
Updating 959d0d5..8784f22
Fast-forward
 greeting.txt  | 1 +
 greeting1.txt | 3 ++-
 2 files changed, 3 insertions(+), 1 deletion(-)
 create mode 100644 greeting.txt
syedU@PF3JLJNX:~/Desktop/ff_merge$ git log --oneline --graph --a
--abbrev          --abbrev-commit   --all             --author=
--abbrev=         --after=          --all-match       
syedU@PF3JLJNX:~/Desktop/ff_merge$ git log --oneline --graph --all
* 8784f22 (HEAD -> master, greeting) created the greeting file
* 959d0d5 (origin/ff_merge, ff_merge) created greeting1.txt


