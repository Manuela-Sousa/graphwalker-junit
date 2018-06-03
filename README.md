# To build

The `graphwalker:generate-sources` plugin need to be run in order to generate the interface(s) from the model(s).

```bash
mvn clean
mvn graphwalker:generate-sources
```

# To run the graphwalker-test plugin

The `graphwalker:test` plugin also automatically runs `graphwalker:generate-sources`. 
The `graphwalker:test` plugin searches for the `@GraphWalker(...)` annotation, and runs that model.

```bash
mvn graphwalker:test
```

# To run the junit tests

Runs all unit tests.

```bash
mvn test
```
