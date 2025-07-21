# DriveMateKMM

モバイルドライバー管理アプリ「DriveMate」のKotlinマルチプラットフォームプロジェクトへようこそ！

## 概要

DriveMateKMMは、Android・iOS両対応の**ネイティブUIアプローチ**を採用した次世代ドライバー管理ソリューションです。  
共通ロジック（ビジネス、API、モデル）はKotlin Multiplatformで開発し、各プラットフォームのUX/UIガイドラインに従ったフルネイティブUIを実装しています。

---

## 主な機能

- ドライバー出勤・退勤管理
- 車両チェックリスト・日次レポート
- 管理者・ドライバー・エクスパット専用ダッシュボード
- リアルタイム位置情報トラッキング（開発中）
- 多言語対応（日本語・インドネシア語・英語）

---

## 技術スタック

- **Kotlin Multiplatform Mobile (KMM)**
- **Android:** Jetpack Compose
- **iOS:** SwiftUI
- **共有ロジック:** リポジトリ、ユースケース、APIクライアント（KMM内）
- **CI/CD:** GitHub Actions

---

## 開発環境・セットアップ

1. **クローン**
   ```bash
   git clone https://github.com/iskandarjajuri/DriveMateKMM.git
