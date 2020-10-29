function toOut(content) {
  let d = new Date();
  let c = "";
  c += d.getHours();
  c += ":";
  c += d.getMinutes();
  c += ":";
  c += d.getSeconds();
  c += "<br>"
  c += content.content;
  $("#output").html(c);
}


// 第一个按钮, (function(){})()表示定义一个函数并立即执行
// $(#id).click(function(){}) 表示响应按钮的点击事件
// 还需要补充点击的时候触发ajax操作
(function() {
  $("button").click(
    function (e) {
      let method;
      let data = "";
      if (e.target.className === "get") {
        method = "get";
      } else {
        method = "post";
        if (e.target.value === "clear") {
          data = {'type': 'clear'};
        } else {
          data = {'type': 'set', 'value': Number(e.target.value)}
        }
      }

      $.ajax({
        type: method,
        url: "/controller",
        data: data,
        dataType: "json",
        success: function (response) {
          console.log(response);
          toOut(response);
        }
      });

    }
  )
})();

/* 
(function() {
  $("#b1").click(function () { 
    // 向输出区写数据
    let out = new Date().toString();
    out += "<br>";
    out += $("#b1")[0].name;
    $("#output").html(out);
  });
})(); */