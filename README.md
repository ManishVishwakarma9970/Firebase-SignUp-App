# 🚀 Firebase Sign Up App (Android)

An Android application with **Splash Screen** and **Firebase Realtime Database** integration for user registration.  
Built with **Kotlin, Android Studio, and Material Design Components**.

---

## ✨ Features
- **Splash Screen** → Auto navigates to Sign Up page after 3 seconds
- **Material Design Sign Up UI** using `TextInputLayout` + `TextInputEditText`
- **Firebase Realtime Database** → Stores user details (Name, Email, Password, Unique ID) under `Users/<uniqueId>`
- **Feedback** with Toasts on success/failure
- Clean code structure with data class: `User(name, mail, password, uniqueId)`

---

## 🛠 Tech Stack
- **Language**: Kotlin
- **IDE**: Android Studio
- **Backend**: Firebase Realtime Database
- **UI**: Material Design Components

---

## 📂 Project Structure (key parts)
- `MainActivity.kt` → Splash screen + delay → navigates to `SignUp`
- `SignUp.kt` → Reads form input & writes to Firebase Realtime Database
- `User.kt` → Data class for user model
- `activity_main.xml` → Splash screen layout
- `activity_main2.xml` → Sign Up layout

---

## ⚙️ Setup & Run
1. **Clone the repo**
   ```bash
   git clone https://github.com/ManishVishwakarma9970/Firebase-SignUp-App.git
   ```
2. **Open in Android Studio**
3. **Connect Firebase**
   - Create a Firebase project (Firebase Console)
   - Add Android app package
   - Download `google-services.json` and place it in: `app/google-services.json`
   - Enable **Realtime Database**
4. **Run**
   - Build & run on Emulator/Device

> ⚠️ Note: For demo/testing, this project writes to Realtime Database using the `uniqueId` as the key.

---

## 📸 Screenshots
Create a `screenshots/` folder and add images with these names for README previews:
- `screenshots/splash.png`
- `screenshots/signup.png`

Markdown preview in README:
```md
![Splash Screen](screenshots/splash.png)
![Sign Up](screenshots/signup.png)
```

---

## 📦 APK (Download)
Check the **Releases** section for the latest APK build:
- https://github.com/ManishVishwakarma9970/Firebase-SignUp-App/releases

---

## 👨‍💻 Author
**Manish Vishwakarma**  
[GitHub](https://github.com/ManishVishwakarma9970)

---

## 📢 Feedback
Open an issue or drop suggestions. Contributions are welcome!

#Android #Firebase #Kotlin #AndroidStudio #MobileApp
