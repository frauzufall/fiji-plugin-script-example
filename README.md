# Fiji Plugin Script Example

This is supposed to be a simple example of a ImageJ / Fiji Command (Plugin) that can be executed in headless mode via script.

## Usage
Replace the paths according to your setup.
Build the Plugin:
```
mvn -Dimagej.app.directory=/PATH/TO/YOUR/Fiji.app -Ddelete.other.versions=true
```
Run the Jython script (after adjusting the image path in the script according to your setup):
cd /PATH/TO/YOUR/Fiji.app
```
./ImageJ-linux64 --ij2 --headless --run /PATH/TO/fiji-plugin-script-example/script/run-plugin.py
```
