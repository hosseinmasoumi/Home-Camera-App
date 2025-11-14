pluginManagement {
    repositories {
        // --- Google (فقط برای پلاگین‌های اندروید/گوگل/اندرویدX) ---
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }

        // --- Mirrors ---
        maven { url = uri("https://gradle.jamko.ir") }
        maven { url = uri("https://en-mirror.ir") }
        maven { url = uri("https://google403.ir") }
        maven { url = uri("https://maven.myket.ir") }
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }

        // --- Fallbacks ---
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    // جلوگیری از تعریف مخزن داخل build.gradle ماژول‌ها
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        // --- Mirrors ---
        maven { url = uri("https://gradle.jamko.ir") }
        maven { url = uri("https://en-mirror.ir") }
        maven { url = uri("https://google403.ir") }
        maven { url = uri("https://maven.myket.ir") }
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://maven.aliyun.com/repository/central") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        // اختیاری: مخزن ملی متن‌باز ایران
         maven { url = uri("https://repo.iranrepo.ir/repository/maven-public/") }

        // --- Fallbacks ---
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "CCTVGuard"
include(":app")
