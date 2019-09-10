# Android Toast library (for completly customizable android Toast) 
# custom Android Toast using KoushikToast  

Create Android toast with custom duration(in seconds),toast icon,toast background,toast text color without changing your known toast writing pattern
```
KoushikToast.makeText(this,"toast text",10).show();
```

## Screenshots

<img src="/Images/default.png" height="400" alt="Screenshot"/> <img src="/Images/default with drawable in background.png" height="400" alt="Screenshot"/>  <img src="/Images/toastwithicon.png" height="400" alt="Screenshot"/>

<img src="/Images/drawblewithtextcolor.png" height="400" alt="Screenshot"/>       <img src="/Images/onlycolor.png" height="400" alt="Screenshot"/>     <img src="/Images/onlyImage.png" height="400" alt="Screenshot"/> 



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

And keep your minSdkVersion 16

```
dependencies {

      implementation 'com.github.koushikDeb:KoushikToast:v1.7

}
```


### HOW TO USE

No need to change your known toast writing pattern  

```
    KoushikToast.makeText(this,"Your text",10).show();
```

Above line will  show "Your text" in a toast for 10 seconds 

### Parameter Breakup of default toast
```
    KoushikToast.makeText(CONTEXT,STRING TO DISPLAY ,DURATION IN SECONDS).show();
        
```
### Other usefull method 

For Custom Icon:

```
.setToastIcon(R.drawable.your_icon)//example Toast with love
```
For Custom Tost Background:
```
.setBackgroundDrawable(R.drawable.default_shape2) //for drawable resource

OR

.setBackgroundColor(R.color.yourcolor)//for color 

```
For Text Color
```
 .setTextColor(android.R.color.white)
```

### Note: You can use above methods in any order after calling make text just remember to call ".show()" at the end  :P


## Developed by

Koushik Deb [Linkedin](https://www.linkedin.com/in/koushik-deb-19562385)

##Android toast custom 

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE.md](/LICENSE) file for details











