[![Circle CI](https://circleci.com/gh/maxthomas/dictum.svg?style=svg)](https://circleci.com/gh/maxthomas/dictum)
![Maven Badges](https://maven-badges.herokuapp.com/maven-central/io.maxthomas/dictum/badge.svg)
[![javadoc.io](https://javadocio-badges.herokuapp.com/io.maxthomas/dictum/badge.svg)](http://www.javadoc.io/doc/io.maxthomas/dictum/)

Current
[Break version](https://github.com/ptaoussanis/encore/blob/master/BREAK-VERSIONING.md):

``` shell
<dependency>
  <groupId>io.maxthomas</groupId>
  <artifactId>dictum</artifactId>
  <version>0.1.2</version>
</dependency>
```

# dictum
## Java NLP schema with functional style
Dictum is a wrapper around
[Concrete](https://github.com/hltcoe/concrete). While a Java library
[exists](https://github.com/hltcoe/concrete-java), the Thrift
generated code leads to a ton of boilerplate, prone to
`NullPointerException`s and other landmines. This project is an
attempt to resolve some warts in `concrete-java`.  In particular:

* Some class names have changed to be more clear. Example:
  `SituationMentionSet` is not actually a set (as in, the data
  structure). In `dictum`, this class is renamed
  `SituationMentionGroup`.
* Null hostility. Attempts to set values to `null` will result in
  unchecked `NullPointerException`s.
* Validation. Attempts are made to validate data structures that have
  embedded, non-semantic rules. These are 'fail-fast': invalid data is
  treated as hostile, and an exception is throw immediately upon
  calling the `.build()` method on the `Builder` objects.
* Use of [FreeBuilder](https://github.com/google/FreeBuilder) to
  implement the Builder pattern on the objects and more
  effectively control required, default and optional fields.

## License
See `LICENSE` in root directory.
