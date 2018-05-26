# scala-pants-01

http://www.pantsbuild.org/install.html

From the root of the git repo

```
curl -L -O https://pantsbuild.github.io/setup/pants && chmod +x pants && touch pants.ini
```

```
./pants -V
```

with scala 2.11 

Run tests (path to BUILD file and target src/test/scala:tests)

```
./pants test.junit --output-mode=ALL src/test/scala:tests
```
