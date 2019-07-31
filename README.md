# Koushik Toast

Create toast with custom duration in (seconds) without changing your known toast writing pattern
```
KoushikToast.makeText(this,"toast text",10).show();
```

## Getting Started
You Will need SYSTEM_ALERT_WINDOW permission as I am using Windowmanager.


### Prerequisites

You Will need SYSTEM_ALERT_WINDOW permission
Add it in menifest
```
    <uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
```

In your activity

```
  @TargetApi(Build.VERSION_CODES.M)
    private void openOverlaySettings() {
        final Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                Uri.parse("package:" + getPackageName()));
        try {
            startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e) {
            Log.e("Exception", e.getMessage());
        }
    }
    
    
    
     @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 0:
                boolean overlayEnabled = Settings.canDrawOverlays(this);// will get the status of permission 
                break;
        }
    }
    

```




### Installing

Step 1. Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

And 

```
dependencies {
	        implementation 'com.github.koushikDeb:KoushikToast:v1.5'
	}
```


### HOW TO USE

No need to change your known toast writing pattern  

```
    KoushikToast.makeText(this,"test Tast text",10).show();
```

Above line will  show "test Tast text" in a toast for 10 seconds 

### Parameter Breakup
```
    KoushikToast.makeText(CONTEXT,STRING TO DISPLAY ,DURATION IN SECONDS).show();
```
















