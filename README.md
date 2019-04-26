# What is this?

It's a sample JavaFX Maven project that integrates with the default "Run" and "Debug" actions in Apache NetBeans. It uses good old classpath to run, no modules here. The example from [the OpenJFX documentation](https://openjfx.io/openjfx-docs/#NB-Maven) does not support debugging for some reason.

# Adapting this example to your own project
- Change `<main.class>org.example.Main</main.class>` in the `pom.xml` to your own main-class
- Be aware that your main-class can't extend `javafx.application.Application` [itself](https://openjfx.io/openjfx-docs/#NB-Maven)
- To see JavaDoc / Source in NetBeans you might want to apply [this workaround](https://stackoverflow.com/a/54279814) until [this issue](https://issues.apache.org/jira/browse/NETBEANS-1396?jql=project%20%3D%20NETBEANS%20AND%20text%20~%20javafx) is fixed
