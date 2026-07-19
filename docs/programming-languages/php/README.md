# 🐘 PHP Learning Resources

Welcome to the **🐘 PHP** index. Below is a curated collection of real-world learning materials, setup instructions, and code blueprints to help you get started.

---

## 📖 Official Documentation
- **[Official PHP Website](https://www.php.net/)**
- **[Docs Landing Page](https://www.php.net/)**

## 📚 Best Free Books & References
- [PHP The Right Way](https://phptherightway.com/) — Easy-to-read reference guide.
- [Modern PHP](https://www.oreilly.com/library/view/modern-php/9781491905173/) — New features, components, and security.
- [Clean Code in PHP](https://www.packtpub.com/product/clean-code-in-php/9781801078337) — Best practice design patterns.

---

## 🛠️ Essential Terminal Commands
```bash
    php -v                        # Check PHP binary version
    php -S localhost:8000         # Start local dev web server
    composer init                 # Initialize composer project
    composer require laravel/installer # Install Laravel framework installer
    php artisan serve             # Run Laravel web application
```

---

## 💻 Starter Code Snippet
```php
<?php
// PHP 8+ Named Arguments and Constructor Promotion
class User {
    public function __construct(
        public string $name,
        public string $role = 'member'
    ) {}
}

$admin = new User(name: 'Alice', role: 'admin');
echo "User: {$admin->name}, Role: {$admin->role}\n";

```

---

## 🎯 Practical Exercise Platforms
- [PHP.net Manual](https://www.php.net/manual/en/) — Official docs database.
- [Laracasts](https://laracasts.com/) — World-class video tutorials for PHP/Laravel.
- [PHP Playground](https://php-playground.com/) — Test script behaviors.

## 🤝 How to Contribute
We welcome more tutorials, cheat sheets, and project implementations. Please see [CONTRIBUTING.md](../../../CONTRIBUTING.md) for pull request guidelines.
