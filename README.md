# Test7_Dialog
>使用多个布局时需要指定正确的调用布局，否则在使用findViewById时会返回null，然而系统不报错。此时需要将布局实例化，再用Layout.findViewById()来实例化控件。同时控件的实例化不可与布局的实例分开，放在匿名内部类中，否则同样会返回一个null值。<br>
>这个问题我理解的不够深，网上给的解释也不够多，所以实在不好描述，只能模模糊糊的说一点内容。