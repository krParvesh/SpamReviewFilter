# Installation Instructions

## Java Backend
To set up the Java backend, follow these steps:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/krParvesh/SpamReviewFilter.git
   cd SpamReviewFilter
   ```

2. **Install Maven**:
   Make sure you have Maven installed. You can download it from [Maven's official site](https://maven.apache.org/download.cgi).

3. **Build the project**:
   ```bash
   mvn clean install
   ```

4. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

## Chrome Extension
To set up the Chrome extension, follow these steps:

1. **Download the extension source code**:
   Clone the repository as mentioned above, if you haven't already.

2. **Load the unpacked extension in Chrome**:
   - Open Chrome and navigate to `chrome://extensions/`
   - Enable "Developer mode" at the top right corner.
   - Click on "Load unpacked" and select the `extension` directory within the cloned repository.

3. **Using the extension**:
   - Follow any additional setup instructions provided in the `extension` directory if available.