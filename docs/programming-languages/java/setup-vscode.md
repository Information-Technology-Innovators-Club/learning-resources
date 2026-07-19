# 🟦 Setting Up VS Code for Java

Visual Studio Code is a lightweight, powerful code editor. You can easily convert it into a fully functional Java IDE.

---

## 📦 Required Extensions
Install the **Extension Pack for Java** by Microsoft, which includes:
- Language Support for Java (Red Hat)
- Debugger for Java (Microsoft)
- Test Runner for Java (Microsoft)
- Maven for Java

---

## ⚙️ Configuration settings.json
Add the following to your VS Code configurations to reference your JDK:
```json
{
  "java.jdt.ls.java.home": "C:\\Program Files\\Eclipse Adoptium\\jdk-17.0.7.7-hotspot",
  "java.format.settings.url": "https://raw.githubusercontent.com/google/styleguide/master/eclipse-java-google-style.xml"
}
```
