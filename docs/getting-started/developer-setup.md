# 🛠️ Developer Environment Setup Guide

Before writing code, you need to configure your development machine. This guide will walk you through setting up a professional development workspace.

---

## 🐚 1. Command Line Setup
The terminal is a developer's second home.
- **Windows**: Install [Windows Terminal](https://aka.ms/terminal) and configure it to use **PowerShell** or **WSL (Windows Subsystem for Linux)**.
- **macOS / Linux**: The default terminal is great. Consider installing **zsh** and [Oh My Zsh](https://ohmyz.zsh.sourceforge.io/) for better formatting and auto-completion.

---

## ⚙️ 2. Version Control (Git)
Git tracks changes in your code and is critical for collaboration.
1. Download and install Git: [git-scm.com](https://git-scm.com/)
2. Configure your identity in the terminal:
   ```bash
   git config --global user.name "Your Name"
   git config --global user.email "your.email@example.com"
   ```
3. Set up an SSH key or personal access token to connect with your GitHub account.

---

## 📝 3. Code Editor
We recommend using a modern, extensible code editor:
- **VS Code**: The industry standard. Free, lightweight, and heavily extensible.
- **Cursor**: An AI-first code editor built on top of VS Code.

### Recommended Extensions:
- **Prettier**: Auto-formats your code for consistency.
- **GitLens**: Supercharges Git features within the editor.
- **Live Server**: Launces a local development server with live reload.
- **Path Intellisense**: Auto-completes filenames in imports.

---

## ☕ 4. Runtime Environments
Install the runtimes for the languages you're learning:
- **Python**: Download Python 3.10+ from [python.org](https://www.python.org/). Ensure you check "Add to PATH" during installation.
- **Node.js**: Install Node.js LTS from [nodejs.org](https://nodejs.org/). This also installs `npm` (Node Package Manager).
