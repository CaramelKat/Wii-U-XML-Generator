# Wii-U-XML-Generator
This program creates a xml file for use with the Wara Wara Plaza from content pulled from reddit

# How do I use this?
You will need a reddit account to use this, you can do that here: https://www.reddit.com/prefs/apps/
Once you've done that, you need to fill out the name, password, clientID, clientSecret, and appID fields in the config.txt from the zip file in releases. **Make sure to leave the | in between each item and do not add spaces**
After this, run the bat file in the same directory as the jar and config file, and it should generate the xml file.

To use it on your Wii U, you can use SDCafiine.
put the xml file in /sdcafiine/0005001010040100/WaraWaraPlaza/content/UsEnglish/Olive/ on your SD card. 

**There is currently a known bug where if any unicode characters end up in the file the Wara Wara Plaza will show all question marks, don't panic, it can't break anything. I'm trying to write a more effiecient solution to fix this, and it will be pushed out in the next release**

This has been tested on a version 5.5.3U, you may have to change the name of the folders to get it to work. 

Use at your own risk.
