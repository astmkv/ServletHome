<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<style>
    input, select {
        margin: 2px;
        width: 50px;
        padding: 1px 2px;
    }

    .radio-button {
        cursor: pointer;
        margin-top: 2px
    }

    button {
        margin: 2px;
    }
    .textAnalyze {
        margin-left: auto;
        width: 80%;
        height: 60px;
    }
    .analyze-res{
        margin-left: auto;
        width: 80%;
        height: 20px;
    }
</style>
<body style="vertical-align: middle; text-align: center">
<h4 style="margin: 5px auto">Quote</h4>
<form action="ViewQuote" method="get" name="view_quote">
    <a href="quote"></a>
    <button>
        View quote
    </button>
</form>
<hr>
<h4 style="margin: 5px auto">Maximum of three</h4>
<form action="MaxOfThree" method="post" name="maxof_three">
    <a href="maxofthree"></a>
    <label>
        Number 1:
        <input type="number" id="num1-field" name="n1_field">
    </label>
    <br>
    <label>
        Number 2:
        <input type="number" id="num2-field" name="n2_field">
    </label>
    <br>
    <label>
        Number 3:
        <input type="number" id="num3-field" name="n3_field">
    </label>
    <br>
    <input type="text" id="result-max" name="result_max" disabled value="${res1}">
    <button style="margin: 2px">
        Get max
    </button>
    <br>
</form>
<hr>

<h4 style="margin: 5px auto">MaxMinAvg</h4>
<form action="MaxMinAvg" method="post" name="max_min_avg">
    <a href="maxminavg"></a>
    <label>
        Number 1:
        <input type="number" id="n1-field" name="num1_field">
    </label>
    <br>
    <label>
        Number 2:
        <input type="number" id="n2-field" name="num2_field">
    </label>
    <br>
    <label>
        Number 3:
        <input type="number" id="n3-field" name="num3_field">
    </label>
    <br>

    <input type="radio" class="radio-button" id="max-radio" name="math_radio" value="max" checked>
    <label for="max-radio">max</label>

    <input type="radio" class="radio-button" id="min-radio" name="math_radio" value="min">
    <label for="min-radio">min</label>

    <input type="radio" class="radio-button" id="avg-radio" name="math_radio" value="avg">
    <label for="avg-radio">avg</label>

    <br>
    <button>
        Get result
    </button>
    <br>
    <input type="text" id="res-mmma" name="res_mma" disabled value="${res2}">
</form>
<hr>
<h4 style="margin: 5px auto">CALCULATOR</h4>
<form action="Calculator" method="post" name="calculator">
    <a href="calculator"></a>

    <input type="number" id="n1-calc" name="num1_calc" value="${num1}">

    <select name="operation">
        <option value="sum"> +</option>
        <option value="diff"> -</option>
        <option value="mult"> *</option>
        <option value="div"> /</option>
        <option value="exp"> ^</option>
        <option value="perc"> %</option>
    </select>

    <input type="number" id="n2-calc" name="num2_calc" value="${num2}">
    =
    <input type="text" id="res-calc" name="res_calc" disabled value="${res3}">
    <br>
    <button> calculate</button>
</form>
<hr>
<h4 style="margin: 5px auto">Text's analyzer</h4>
<form action="Analyzer" method="post" name="analyzer">

    <input type="text" class="textAnalyze" id="input-text" name="input_text" value="${text}">
    <br>
    <input type="text" class="analyze-res" id="vowels-res" name="vowels_res" disabled value="${vowels}">
    <br>
    <input type="text" class="analyze-res" id="conso-res" name="conso_res" disabled value="${conso}">
    <br>
    <input type="text" class="analyze-res" id="punct-res" name="punct_res" disabled value="${punct}">
    <br>
    <button> analyze </button>
    <%--<h2>Call doGet:</h2>--%>
    <%--<a href="test-servlet"></a>--%>
    <%--<form action="test-servlet" method="get" style="margin: 50px;">--%>
    <%--    <button>--%>
    <%--        go to doGet--%>
    <%--    </button>--%>
    <%--</form>--%>
</body>
</html>