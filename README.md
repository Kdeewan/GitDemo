# GitDemo

Kalpit@Kartik MINGW64 ~/Documents/workspace_git_project/GitDemo
$ git init
Initialized empty Git repository in C:/Users/Kalpit/Documents/workspace_git_project/GitDemo/.git/

Kalpit@Kartik MINGW64 ~/Documents/workspace_git_project/GitDemo (master)
$ git add .

Kalpit@Kartik MINGW64 ~/Documents/workspace_git_project/GitDemo (master)
$ git config --global user.email "kartik.d@gmail.com"

Kalpit@Kartik MINGW64 ~/Documents/workspace_git_project/GitDemo (master)
$ git config --global user.name "Kartik"

Kalpit@Kartik MINGW64 ~/Documents/workspace_git_project/GitDemo (master)
$ git commit -m "First commit"
[master (root-commit) 4803a98] First commit
....

Kalpit@Kartik MINGW64 ~/Documents/workspace_git_project/GitDemo (master)
$ git remote add origin https://github.com/Kdeewan/GitDemo.git

Kalpit@Kartik MINGW64 ~/Documents/workspace_git_project/GitDemo (master)
$ git remote -v
origin  https://github.com/Kdeewan/GitDemo.git (fetch)
origin  https://github.com/Kdeewan/GitDemo.git (push)

Kalpit@Kartik MINGW64 ~/Documents/workspace_git_project/GitDemo (master)
$ git push origin master
