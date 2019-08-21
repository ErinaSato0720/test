<!DOCTYPE html>
<html lang="ja">

<head>
<meta charset="UTF-8">
  <title>4eachblog 掲示板</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
	
<body>
  <img src="4eachblog_logo.jpg">
	
  <header>
   <div class="menu">
	<ul>
	  <li>トップ</li>
      <li>プロフィール</li>
      <li>4eachについて</li>
      <li>登録フォーム</li>
      <li>問い合わせ</li>
      <li>その他</li>
	</ul>
   </div>
  </header>
	
  <main>
	<div class="main-container">
	<div class="left">
	<h1>プログラミングに役立つ掲示板</h1>
	  
<form method="post" action="insert.php">
<div class="h2">
<h2>入力フォーム</h2></div>
  <div>
   <label>ハンドルネーム</label>
  <br>
   <input type="text" class="text" size="40" name="handlename">
  </div>
  <div class="title">
   <label>タイトル</label>
   <br>
   <input type="text" class="text" size="40" name="title">
  </div>
  <div class="comments">
   <label>コメント</label>
   <br>
	  <textarea cols="70" rows="15" name="comments"></textarea>
  </div>
	  
  <div>
   <input type="submit" class="submit" value="送信する">  
  </div>
   </form>
  
		
  
<?php
	  
mb_internal_encoding("utf8");
$pdo=new PDO("mysql:dbname=sato;host=localhost;","root","mysql");
$stmt=$pdo->query("select * from 4each_keijiban");
	  
while($row=$stmt->fetch()){
 echo "<div class='left2'>";
 echo "<div class='kijititle'>";
 echo "<h3>".$row['title']."</h3>";
 echo "<div class='contents'>";
 echo $row['comments'];
 echo "<div  class='moji'>posted by".$row['handlename']."</div>";
 echo "</div>";
 echo "</div>";
 echo "</div>";
}
	  
?>
</div>
	  
	<div class="right">
	 <div class="kiji">
	   <h2>人気の記事</h2>
		 <p>PHPオススメ本</p>
		 <p>PHP MyAdminの使い方</p>
		 <p>いま人気のエディタ　Top5</p>
		 <p>HTMLの基礎</p>
	   <h2>オススメリンク</h2>
		 <p>インターノウス株式会社</p>
		 <p>XAMPPのダウンロード</p>
		 <p>Eclipseのダウンロード</p>
		 <p>Bracketsのダウンロード</p>
	   <h2>カテゴリ</h2>
		 <p>HTML</p>
		 <p>PHP</p>
		 <p>MySQL</p>
		 <p>JavaScript</p>
	 </div>
	</div>
	</div>
  </main>
	
  <footer>
	copyright©internous I 4each blog is the one which provides A to Z about programming.
  </footer>

</body>	
	
</html>