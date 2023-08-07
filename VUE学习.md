---
title: VUE学习
category: /小书匠/日记/2023-08
grammar_cjkRuby: true
---



----------


# VUE基础知识学习

1. v-show和v-if的区别与应用场景
   v-show有较强的渲染开销
   v-if有较强的切换开销
![enter description here](./images/1691201239096.png)
2. 怎么理解事件监听器和子组件？
3. 列表渲染：
   ![enter description here](./images/1691201444954.png)
   较为复杂的数据
   ![enter description here](./images/1691201686608.png)
  4. 通过key来管理v-for的循环
     ![enter description here](./images/1691204695570.png)
## VUE的事件处理
1. ![enter description here](./images/1691422981082.png)
2. DOM的解释
~~~
"DOM" 是 "Document Object Model"（文档对象模型）的缩写。DOM 是一种用于表示和操作文档的标准化方式，通常指的是 HTML 和 XML 文档。DOM 将文档内容（如元素、属性、文本）以一个树状结构的方式表示，每个节点都代表文档中的一个元素、属性或文本节点。

在网页开发中，DOM 在浏览器中充当一个接口，允许开发人员通过编程方式操作和修改网页的内容、结构和样式。使用 DOM，开发人员可以通过 JavaScript 等脚本语言来动态地改变网页内容，例如添加、删除、修改元素，改变样式，以及对用户操作做出响应。

DOM 的树状结构允许开发人员通过遍历节点、访问属性和执行操作来与文档进行交互。这种交互性使得动态网页和 Web 应用程序的开发变得更加灵活和交互性。

总之，DOM 是一种用于表示和操作文档的标准化模型，它在网页开发中扮演了重要的角色，允许开发人员通过脚本语言与网页进行动态交互和修改。
~~~
3. DOM事件的解释
~~~
DOM 事件是指在网页中发生的各种交互和操作，例如用户点击、输入文本、移动鼠标等，都可以触发不同类型的 DOM 事件。这些事件允许开发人员通过 JavaScript 等脚本语言来捕获和处理用户的操作，以实现动态交互和响应。

每个 DOM 元素都可以监听多种不同类型的事件，如点击事件、键盘事件、鼠标移动事件等。当事件被触发时，网页中的相应元素会发送一个信号，通知网页的脚本代码来处理这个事件。开发人员可以通过添加事件监听器（也称为事件处理函数）来定义在特定事件发生时要执行的操作。

以下是一些常见的 DOM 事件类型：

- **点击事件（click）**：当用户点击一个元素时触发，通常用于响应用户的鼠标点击操作。

- **键盘事件（keydown、keyup、keypress）**：当用户在页面上按下或释放键盘上的键时触发，用于捕获用户的键盘输入。

- **鼠标移动事件（mousemove）**：当用户移动鼠标时触发，通常用于跟踪鼠标的位置。

- **表单事件（submit、input、change）**：当用户在表单元素中输入文本、提交表单或改变输入时触发，用于处理用户的输入操作。

- **焦点事件（focus、blur）**：当元素获得或失去焦点时触发，通常用于处理用户与输入框、链接等元素的交互。

通过监听和处理这些事件，开发人员可以实现与用户的互动，改变网页内容、样式和行为，从而创造出更具有交互性和响应性的网页和 Web 应用程序。
~~~
4. 对e.target.innerHTML的讲解
~~~
代码：
<template>
  <h3>方法事件处理器</h3>
  <button @click="addCount">Add</button>
  <p>Count is: {{count}}</p>
</template>

<script>
export default {
  data() {
    return {
      count:0
    }
  },
  // 所有的方法和函数都放在这里
  methods: {
    addCount(e){
      // 读取到data里面的数据的方案：this.count
      e.target.innerHTML = "Add" + this.count
      this.count += 1
    }
  }
}
</script>



`e.target.innerHTML = "Add" + this.count` 是在 Vue.js 组件中的一个代码行，它用于修改事件触发元素（即按钮）的内部 HTML 内容。

在这个具体的例子中，这段代码出现在 `addCount` 方法内部，该方法被绑定在按钮的点击事件上。当按钮被点击时，`addCount` 方法会被调用，并且传入一个事件对象 `e`，其中 `e.target` 表示触发事件的 DOM 元素，即按钮本身。

代码行 `e.target.innerHTML = "Add" + this.count` 的作用是将按钮的文本内容修改为当前的计数值（`this.count`），并在计数值前加上 "Add" 字符串。换句话说，每次按钮被点击时，按钮上的文本会变成类似 "Add1"、"Add2"、"Add3" 等形式，其中的数字会随着计数的增加而变化。

总之，这段代码是用来在按钮被点击时，动态更新按钮的文本内容，以显示当前的计数值。
~~~
5. 对于Event对象的理解
https://blog.csdn.net/m0_51528800/article/details/124811763?ops_request_misc=&request_id=&biz_id=102&utm_term=%E5%A6%82%E4%BD%95%E7%90%86%E8%A7%A3Event%E5%AF%B9%E8%B1%A1&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduweb~default-2-124811763.142^v92^chatsearchT0_1&spm=1018.2226.3001.4187
