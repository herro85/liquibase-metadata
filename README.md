# liquibase-metadata

*Overview*

This application reads a Liquibase changelog config file and generates technical metadata as a JSON output for Atlas-based metadata management apps.

*Features*

- Parses Liquibase changelog files in XML or JSON format
- Extracts technical metadata from changesets and changes
- Generates JSON output compatible with Atlas metadata management

*Usage*

1. Build the application using Gradle or Maven
2. Run the application with the following command:
```
java -jar liquibase-changelog-parser.jar <changelog_file> <output_file>
```
- `<changelog_file>`: Path to the Liquibase changelog file
- `<output_file>`: Path to the output JSON file

*Configuration*

- The application uses the following configuration properties:
    - `liquibase.changelog.file`: Path to the Liquibase changelog file
    - `output.file`: Path to the output JSON file
    - `atlas.metadata.url`: URL of the Atlas metadata management API (optional)

*Technical Metadata*

- The application generates the following technical metadata:
    - Changeset ID
    - Changeset author
    - Changeset date
    - Change type (e.g. CreateTable, AddColumn, etc.)
    - Table name
    - Column name
    - Data type
    - Constraints (e.g. primary key, foreign key, etc.)

*Atlas Integration*

- The application can optionally send the generated metadata to the Atlas metadata management API using the `atlas.metadata.url` configuration property.

*Building and Running*

- The application can be built using Gradle or Maven
- Run the application using the command above

*License*

- This application is licensed under the Apache License 2.0

*Contributing*

- Contributions are welcome! Please open a pull request with your changes.

*Acknowledgments*

- This application uses the Liquibase library for changelog parsing.
- This application uses the Atlas metadata management API for integration.

Note: This is just a sample README document, please make sure to update it according to your application's specific requirements and features.
