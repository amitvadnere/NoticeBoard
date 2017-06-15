<html>
    <head>
        <title>SignUp</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://fonts.googleapis.com/css?family=Josefin+Sans" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Covered+By+Your+Grace|Didact+Gothic|Oxygen" rel="stylesheet">
        <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
        <style type="text/css">
            <!-- @import url("css/register.css");
            -->
        </style>
    </head>
    <body>
            <div class="container-fluid">
                <div class="jumbotron" id="inner-element">
                <div class="row">
                    <div class="col-sm-6">
                        <div class="jumbotron" id="brand">
                            <span class="brand-logo"><span class="black">notice</span><span class="white">board</span></span>
                            
                        </div>
                       Medi-Caps Institute of Technology and Management (now Medi-Caps University), also known as Medicaps is a central Indian management and engineering institute.Baptized in an endearing spirit, Medi-Caps Institute of Technology and Management took its first step in July 2000 with a vision to design future scientifically. Within a short span of nine years the Institute has attained a strong footing amongst all the technical colleges of Madhya Pradesh. 
                    </div>
                    <div class="col-sm-6" id="signup">
                        <h4>SIGN UP</h4><hr><br>
                        <form action="registerServlet" method="get" >
                        <div class="row">
                            <div class="col-sm-3">Name</div>
                            <div class="col-sm-6"><input type="text" name="name"></div>
                        </div><br>
                        <div class="row">
                            <div class="col-sm-3">Gender</div>
                            <div class="col-sm-6">
                                <select name="gender">
                                    <option value="male">Male</option>
                                    <option value="female">Female</option>
                                </select>
                            </div>
                        </div><br>
                        <div class="row">
                            <div class="col-sm-3">D.O.B</div>
                            <div class="col-sm-6"><input type="date" name="dob"></div>
                        </div><br>
                        <div class="row">
                            <div class="col-sm-3">E-mail</div>
                            <div class="col-sm-6"><input type="email" name="email"></div>
                        </div><br>
                        <div class="row">
                            <div class="col-sm-3">Contact No</div>
                            <div class="col-sm-6"><input type="text" name="contact"></div>
                        </div><br>
                        <div class="row">
                            <div class="col-sm-3">Designation</div>
                            <div class="col-sm-6"><input type="text" name="designation"></div>
                        </div><br>
                        <div class="row">
                            <div class="col-sm-3">Password</div>
                            <div class="col-sm-6"><input type="password" name="paswrd"></div>
                        </div><br>
                        <div class="row">
                            <div class="col-sm-3"> Confirm Password</div>
                            <div class="col-sm-6"><input type="password" name="cnfrmpaswrd"></div>
                        </div><br><br>
                         <div class="row">
                        <div ><input id="next" class="btn pull-right" type="submit" value="SIGN UP"></div>
<!--                        <div class="col-sm-6"><input id="next" type="submit" value="SIGN IN"></div>-->
                        </div>
                        </form>
                    </div>
                </div>
                </div>
            </div>
    </body>
</html>
