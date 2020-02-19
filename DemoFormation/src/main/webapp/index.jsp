<html>
<body>
<h2>Hello World!</h2>

<form action ="CreationFormationServlet" method="post">
<label for="site-search">Inserer une formation</label>
<input type="search" id="theme" name="theme"
       aria-label="theme" placeholder="theme">
<input type="search" id="adresse" name="adresse"
aria-label="adresse" placeholder="adresse">
       <input type="submit" value="Inserer" name="button1" onclick="callServlet();">
</form>
</body>
</html>
