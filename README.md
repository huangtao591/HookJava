# HookJava

jni中用到的库就是看雪上的库，这里占用太大就不附加在里面了

与https://github.com/huangtao591/HookInject/tree/master一起开发，注入包名，函数都硬编码在里面
两个工程都使用了看雪的大神http://bbs.pediy.com/showthread.php?t=186054中的代码，本人只是做了部分修改来实现自己的需求，
核心功能全来自看雪的贴子，这里主要作为一个个人使用的备份，毕竟刚开始的时候折腾这个功能也折腾了很久。

被注入的libso.so的代码在4.0及4.0.3中无法正常运行，本人是在android4.4_API19的虚拟机中运行的。