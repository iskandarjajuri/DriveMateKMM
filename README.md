<<<<<<< HEAD
# DriveMateKMM 🚗

Kotlin Multiplatform（KMM）で開発したドライバー管理アプリです。  
Android（Jetpack Compose）とiOS（SwiftUI）のネイティブUIで動作します。

---

## 主な機能

- 管理者・ドライバー・エクスパットのログイン
- ネイティブUIダッシュボード（Android & iOS）
- 出退勤記録、車両チェックリスト、日次PDFレポート
- ドライバーのリアルタイム追跡（今後実装予定）
- タスク通知

---

## スクリーンショット

<!-- ここにアプリのスクリーンショットを貼り付けてください -->
<!-- 例: ![Androidダッシュボード](path/to/android-screenshot.png) -->

---

## インストール & 実行方法

```bash
git clone https://github.com/iskandarjajuri/DriveMateKMM.git
cd DriveMateKMM

	•	Android: androidApp/をAndroid Studioで開いて「Run」
	•	iOS: iosApp/でpod install実行 → iosApp.xcworkspaceをXcodeで開いて「Run」
使用例
val user = UserRepositoryImpl().getUserById("123")
println(user.name)
コントリビューション

バグ報告や機能提案はIssueまたはPull Requestでお願いします。

⸻

ライセンス

MIT © 2025 Iskandar Jajuri

⸻

連絡先
	•	https://www.linkedin.com/in/iskandar-jajuri-7366b911a/
	•	メール: iskandarjajuri@gmail.com
=======
This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
    - `commonMain` is for code that’s common for all targets.
    - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
      For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
      `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here
  too.

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
>>>>>>> d5f7c7d (Initial commit: DriveMateKMM)
