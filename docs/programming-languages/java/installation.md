# 📥 Java Development Kit (JDK) Installation

To compile and run Java programs, you need to install the **Java Development Kit (JDK)**. We recommend using **OpenJDK 17** or **OpenJDK 21** (LTS versions).

---

## 💻 Installation Steps

### Windows (Chocolatey or Manual)
1. Download the installer from [Adoptium (Eclipse Temurin)](https://adoptium.net/).
2. Run the `.msi` file and ensure "Add to PATH" and "Set JAVA_HOME" options are checked.
3. Verify in Command Prompt:
   ```cmd
   java -version
   javac -version
   ```

### macOS (Homebrew)
1. Run in Terminal:
   ```bash
   brew install openjdk@17
   ```
2. Symlink the JDK to the system wrapper:
   ```bash
   sudo ln -sfn /opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
   ```

### Linux (Ubuntu/Debian)
1. Run in Terminal:
   ```bash
   sudo apt update
   sudo apt install openjdk-17-jdk
   ```

---

## 🔧 Environment Variables Setup
Ensure `JAVA_HOME` is set to the JDK root path and `%JAVA_HOME%\bin` (Windows) or `$JAVA_HOME/bin` (macOS/Linux) is added to your environment `PATH` variable.
