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
	 5. 对于CSS中flex的理解——平均分配

> 在 CSS 中，`flex` 是一个用于 Flexbox 布局的属性，用于控制 flex 容器中 flex 项的分布和调整。`flex: 1;` 是 `flex` 属性的一个常见用法，表示一个 flex 项将会占据剩余的可用空间。

当你将 `flex` 设置为 `1` 时，它会告诉浏览器将剩余的空间均匀分配给具有 `flex: 1;` 属性的所有 flex 项。这在自适应布局中很有用，特别是当你希望某些项占据剩余空间，而其他项根据其内容大小进行适应。

以下是一个示例，展示如何使用 `flex: 1;`：

HTML：
```html
<div class="flex-container">
  <div class="flex-item">Item 1</div>
  <div class="flex-item">Item 2</div>
  <div class="flex-item">Item 3</div>
</div>
```

CSS：
```css
.flex-container {
  display: flex;
}

.flex-item {
  flex: 1; /* 所有的 flex 项都将均匀分配剩余的可用空间 */
  border: 1px solid black;
  padding: 10px;
}
```

在这个示例中，`.flex-item` 具有 `flex: 1;` 属性，这意味着它们会均匀地占据剩余的可用空间，从而使三个项目的宽度相等。如果你在父容器中添加更多的 `.flex-item`，它们也会以相等的宽度平均分配剩余空间。

`flex: 1;` 是一个常用的技术，能够轻松实现简单的自适应布局，但在更复杂的布局中，你可能需要更多的 flex 属性来达到所需的效果。