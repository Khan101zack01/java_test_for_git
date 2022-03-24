this file for checking git, ANd update local git from web.
it's for sclass 2.8 for simple conflict in version
it's gonna be conflict between versions.2.8 in the same line in the file from 2.8
4.3{
git restore <file> -> restore did not add file to begin
git restore --staged <file> -> restore the added file to did not edd file |^
git reset --hard -> restore files to begin version, but it's useless for new file did not add in git
}
4.5{
git reset --soft hash-num -> just reset the commit to the added (green index) to the till hash(commit) ,
in an example it was rest to last commit .

git reset HEAD~n -> n-> means number, there we reset them count of the last commit ,
example n=1 means we reset last 1 commit, and it'll be in red index.

git reset --hard commit_id -> delete all commits to till commit_id,
commit_id will be the head(last)

git commit --amend -m <new_name> -> to change the name of the last commit,

git commit --amend --no-edit -> is for add forgotten file to the commit,
without changing name of the file.

            
}