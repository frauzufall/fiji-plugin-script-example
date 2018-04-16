# @IOService io
# @CommandService command
# @ModuleService module

from java.io import File
from java.nio.file import Files

from my.test import TestPlugin

inpath = "/home/random/Development/imagej/plugins/fiji-plugin-script-example/script/blobs.tif"
outpath = "/home/random/Development/imagej/plugins/fiji-plugin-script-example/script/out.tif"
myinput = io.open(inpath)
myfuture = command.run(TestPlugin, True, "input", myinput)
mymodule = module.waitFor(myfuture)
print(mymodule)
myoutput = mymodule.getOutput("output")
print(myoutput)

# how to I get rid of the following lines?
infile = File(inpath)
outfile = File(outpath)
if not(outfile.exists()):
	Files.copy(infile.toPath(), outfile.toPath())

io.save(myoutput, outpath)
