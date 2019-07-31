Create toast with custom duration in (seconds) without changing your known toast writing pattern  

Implementation Procedure:
Step 1. Add the JitPack repository to your build file
       
{
allprojects 
       repositories 
                      {
                       ...
                        maven { url 'https://jitpack.io' }
                }
        }


Step 2. Add the dependency

dependencies {
   implementation 'com.github.koushikDeb:KoushikToast:v1.1'
        }



Add permision in Menifest:
<manifest >
    <uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
    .....
</menifest>


