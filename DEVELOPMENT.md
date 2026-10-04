# Development

Run `python tools/check_repository.py` with Python 3.12, a JDK and GCC available.
The declared targets compile the address book and character catalog independently.
From `character-catalog`, compile `javac -d build src/Lab2/*.java`, then run
`java -cp build Lab2.Lab2`. Its data directory contains fictional example actors
and characters, replacing absent original CSVs.

For each Android directory, use JDK 17 and Android SDK 34. Run `./gradlew
testDebugUnitTest assembleDebug assembleDebugAndroidTest` there (Windows:
`gradlew.bat ...`). Official Gradle 8.9 wrappers and checksums are restored.
The property app uses fictional labeled locations and prices. The trivia app
uses new simple questions and original vector stars as demonstration treats and simple home/lightbulb logos;
they are not recovered original course images or data.

CI builds both apps and their test APKs. Device interaction and visual layout
still require Android Studio or an emulator. No personal SDK path is committed.
