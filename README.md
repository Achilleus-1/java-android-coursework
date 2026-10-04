# Java and Android Coursework

Java object models and Android coursework apps for property listings and multi-view trivia.

## Original coursework

- CS 3443-004 — Application Programming, Fall 2024

Originally completed at the University of Texas at San Antonio during the terms above and imported to GitHub later. This repository preserves the submitted implementation; repository documentation and import housekeeping were added separately.

**Languages and technologies:** Java, Android, XML resources, Gradle Kotlin DSL.

## Implementation

- Address-book models with inheritance.
- Character/product collection parsing.
- An Android property-listing interface and model layer.
- A multi-view trivia application with controllers and navigation.

## Concepts

- Inheritance, file parsing, separation of model/UI concerns, Android activities, and resource-based layouts.

## Repository layout

| Directory | Contents |
|---|---|
| `address-book` | Java contact hierarchy |
| `character-catalog` | Java catalog and data model |
| `property-listing-android` | Android listing app |
| `trivia-android` | Android multi-view trivia app |

## Running the source

Compile the two Java exercises independently. Open each Android project in Android Studio with the matching SDK and Gradle version from its build files. The wrapper JAR and bitmap launcher icons are excluded from this code-only import and must be restored through the toolchain/resources before a complete build.

## Scope and limitations

- The character catalog expects barbies.csv and kens.csv, which were omitted from this code-only import. Its Java source compiles.
- This is coursework with supplied starter/test scaffolding, not four independently shipped products.

Only source code, build configuration, and required text inputs are included. Written submissions, assignment instructions, PDFs, videos, generated outputs, binary builds, and private configuration are omitted. Anonymized contributor labels and supplied-code comments retain the distinction between submitted work and scaffolding. No license for course-provided material is inferred.
