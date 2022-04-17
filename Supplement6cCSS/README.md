**Supplement: Cascading Style Sheets (CSS)**

**For Introduction to Java Programming\
By Y. Daniel Liang**

Cascading Style Sheets (CSS) is a simple mechanism for adding styles
(e.g., fonts, colors, spacing, margins, etc) to Web pages. CSS enables
you to separate the contents of a Web page from its presentation and
therefore makes Web pages easy to maintain and modify. You can use style
sheets to specify the appearance of a Web page. Style sheets can be used
to completely replace the \<basefont\>, \<font\>,
`\<frameset\>`, \<center\>, `\<strike\>`, and
\<u\>, \<cite\>, \<code\>, \<em\>, `\<strong\>`,
`\<var\>`, `\<address\>`, \<b\>, and
`\<i\>` tags and the `size` and
`width` attributes in the \<hr\> and `\<table\>`
tags. This supplement covers the following topics:

-   Inline style

-   Document style sheet

-   External style sheet

-   Cascading order

-   Fonts

-   Text alignments, indents, and decorations

-   Padding, border, and margin

-   Dimensions and line spacing

-   CSS selectors

-   CSS pseudo-classes

-   `span` and `div` Elements

-   CSS Lists

-   The `float` property

-   The `display` property

-   Relative and absolute positions

-   Replacing frames using CSS

-   Creating a horizontal menu

-   CSS Media Types

**1 Introduction *\<Side Remark: cascading\>***

Cascading Style Sheets (CSS) specify properties for tags. For example,
you can specify a style sheet on a paragraph tag \<p\> to tell a browser
how to render a paragraph with specified color, font, width, etc. Style
sheets are *cascading* because they can be defined at three levels:
*inline*, *document*, and *external*. Inline style sheets can override
document and external style sheets, and document style sheets can
override external style sheets. So, the style on a tag is determined
through a cascade of style sheets.

2.  **Inline Styles**

You can directly insert styles into an XHTML tag using the XHTML
`style` attribute. This is called *inline styles*. Listing 1
shows an example inline styles. Listing 1 is rendered as shown in Figure
1.

**Listing 1 CssInlineStyleDemo.css (Inline Style Demo)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code\*\*\* \*\*\*Layout: Please layout exactly. Don't skip the
space. This is true for all source code in the book. Thanks, A.***

***\<Side Remark line 1: XHMTL strict\>***

***\<Side Remark line 4: comment\>***

***\<Side Remark line 11: `hl` style\>***

***\<Side Remark line 13: p style\>***

***\<Side Remark line 14: em style\>***

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}  
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>

`\<!\-- CssInlineStyleDemo.html \--\>`

`\<html\>`  
\<head\>

\<title\>Inline Style Demo\</title\>  
\</head\>
>
> \<body\>

\<h1 style = \"font-family: Times New Roman, sans-serif; font-size:
20pt; color: green\"\>Inline Style Demo\</h1\>

\<p style = \"color: red\"\>Welcome to

\<em style = \"color: black; background-color:
yellow\"\>CSS\</em\>\</p\>

\<p\>Welcome to HTML\</p\>  
\</body\>

`\</html\>`

![](media/image1.jpeg){width="3.426388888888889in"
height="2.120138888888889in"}

**Figure 1**

*The styled page in Listing 1 is rendered by a Web browser.*

Line 1 tells the browser which type of file this is. In this case, it is
XHTML 1.1.

The style for the `h1` tag in lines 11-12 specifies that the
content for this `hl` tag will be rendered using the Times
New Roman font with a 20pt (20 point) font size and color green. If the
Web browser does not support Times New Roman, the generic sans-serif
font will be used as an alternative.

The style for the p tag in lines 13-14 specifies that the content for
this p tag will be rendered using the red color.

The style for the `em` tag in line 14 specifies that the
content for this em tag will be rendered using the black color and
yellow background color.

Inline style sheets specify the properties for one time application of a
single tag. The color for the p tag in line 13 is specified, but no
color is specified for the p tag in line 15. Therefore, the default
color is applied to the tag `p` tag in line 15.

***\<Side Remark: inline style syntax\>***

The syntax for inline style sheets is:

[style = \"property1: value1, value1a; property2: value2; \...
\"]{.underline}

For example, [style = \"font-family: Times New Roman, sans-serif;
font-size: 20pt;]{.underline} color: green\"

The *property* (e.g., `color`,
`background-color`, `font-family`,
`font-size`) specifies an attribute for laying out the
element. The *property-value* gives the attribute value. A style may
have multiple properties separated by semicolons (;). A property may
specify multiple values separated by a

© Copyright Y. Daniel Liang, 2005 3

comma (,). The browser attempts to use the value in the order they
appear in the rule declaration. If a value is not supported by the
browser, the next value will be considered.

3.  **Document Style Sheets**

You can specify a style for a tag in a document style sheet so that the
style can apply to the tag throughout the document. The document style
sheet must be placed inside the `head` element. Listing 2
shows an example of using the document style sheet. Listing 2 is
rendered as shown in Figure 2.

**Listing 2 CssDocumentStyleDemo.html (Document Style Sheet Example)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This***

***is true for all source code in the book. Thanks, A.***

***\<Side Remark line 1: DOCTYPE\>***

***\<Side Remark line 8: style element\>***

***\<Side Remark line 9: `hl` style\>***

***\<Side Remark line 11: p style\>***

***\<Side Remark line 12: em style\>***

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}  
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>

`\<!\-- CssDocumentStyleDemo.html \--\>`

`\<html\>`  
\<head\>

\<title\>Document Style Demo\</title\>

\<style\^ype=\"text/css\"\>

hl {font-family: \"Times New Roman\", sans-serif; font-size: 20pt;
color: green}

p {color: red}

em {color: black; background-color: yellow }

\</style\>  
\</head\> \<body\>

\<h1\>My First Styled Page\</h1\>

\<p\>Welcome to \<em\>CSS\</em\>\</p\>

\<p\>Welcome to HTML\</p\>  
\</body\>

`\</html\>`

![](media/image2.jpeg){width="3.2333333333333334in" height="1.9in"}

**Figure 2**

*The styled page in Listing 2 is rendered by a Web browser.*

Line 8

\<style type = \"text/css\"\>

tells the browser this is a style sheet.

Lines 9-10

[h1 {font-family: \"Times New Roman\", sans-serif; font-size: 2
0pt;]{.underline} color: green}

specifies a style for the `h1` element. All `h1`
elements will be rendered using the Times New Roman font with a 20pt (20
point) font size and color green. If the Web browser does not support
Times New Roman, the generic sans-serif font will be used as an
alternative.

Line 11

[p {color: red}]{.underline}

specifies a style for the p element. All p elements will be rendered red
color.

Line 12

[em {color: black; background-color: yellow}]{.underline}

specifies a style for the em element. All em elements will be rendered
in foreground color black on yellow background.

***\<Side Remark: document style sheet syntax\>***

A document style sheet is made up of CSS rules. Each rule is written as

[selector {property1: value1, value1a; property2: value2;
\...}]{.underline}

For example, [h1 {font-family: \"Times New Roman\", sans-serif;
font-size: 2 0pt;]{.underline} color: green}

The *selector* (h1, p, and em in the example) tells the browser which
element the style is applied to. Unlike the inline style sheet, the
properties and values are enclosed inside the braces in the document
style sheet.

4.  **External Style Sheets**

You may create a style sheet in a separate file so it can be shared by
multiple Web pages. Listing 3 is a style sheet stored in a separate file
named CssExternalStyleSheet.css. By convention, file name extension for
CSS files are .css. Lines 1-2 are comments. Comments may be placed in
any type of CSS code (i.e., embedded or external). A CSS comment starts
with `/\*` and end with `\*/` . Lines 3-6 define
the styles for the `hl`, p, and em elements.

**Listing 3 CssExternalStyleSheet.css (External Style Sheet)**

-   ***\*\*PD: Please add line numbers (including space lines) in the
    following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks, A.***

***\<Side Remark line 1: comment\>***

***\<Side Remark line 2: `hl` style\>***

***\<Side Remark line 4: p style\>***

***\<Side Remark line 5: em style\>***

`/\* Define styles for hl, p, and em \*/`

[hl {font-family: \"Times New Roman\", sans-serif; font-size: 2
0pt;]{.underline} color: green} [p {color: red } em {color: black;
background-color: yellow}]{.underline}

Listing 4 shows an example that uses the external style sheet in Listing
3. Listing 4 is rendered as shown in Figure 2, since Listing 4 and
Listing 2 use the same style sheet.

**Listing 4 CssExternalStyleDemo.html (Linking External Style Sheet)**

-   ***\*\*PD: Please add line numbers (including space lines) in the
    following code\*\*\****

-   ***\*\*Layout: Please layout exactly. Don't skip the space. This is
    true for all source code in the book. Thanks, A.***

***\<Side Remark line 1: DOCTYPE\>***

***\<Side Remark line 8: external style\>***

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}
\'\'[http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd^11^](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)\>

`\<!\-- cssExternalStyleDemo.html \--\>`

`\<html\>`  
\<head\>

\<title\>My first styled page\</title\>

\<link rel = \"stylesheet\" type = \"text/css\" href =
\"CssExternalStyleSheet.css\" /\> \</head\>  
\<body\>

\<h1\>External Style Demo\</h1\>

\<p\>Welcome to \<em\>CSS\</em\>\</p\>

\<p\>Welcome to HTML\</p\>  
\</body\>

`\</html\>`

Lines 8-9

`\<link rel = \"stylesheet\" type = \"text/css\"`

`href = \"cssExternalStyleSheet.css\" /\>`

links the external style sheet CssExternalStyleSheet.css in the XHTML
file so that the styles specified in the style sheet are applied to this
page.

>TIP:

***\<Side Remark: validating CSS\>***  
The W3C provides a free service for validating whether the external
> CSS file conforms to the CSS standard. To use the service, go to
> jigsaw.w3.org/css-validator.

**5 Cascading Order**

Style information can be declared in many ways. A Web page may contain
inline styles, document styles, and external styles. Even multiple
external styles can be referenced in a single Web page. Different style
sheets may cause conflict. The browser "cascades" all style sheets into
a "virtual" style sheet in the following precedence (from highest to
lowest):

1.  Inline style (inserted directly a tag)

2.  Document style (declared in the \<head\> section)

3.  External style

4.  Browser default

Styles defined for the parent elements are inherited by child elements.
Style defined in the child elements take precedence over styles defined
in the parent elements. Listing 5 shows an example that demonstrates how
style sheets are cascaded. Listing 5 is rendered as shown in Figure 3.

**Listing 5 CssCascadingStyleDemo.html (Cascading Style Sheets)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks, A.***

***\<Side Remark line 1: DOCTYPE\>***

***\<Side Remark line 8: external style\>***

***\<Side Remark line 10: document style\>***

***\<Side Remark line 18: inline style\>***

© Copyright Y. Daniel Liang, 2005 7

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>

`\<!\-- CssCascadingStyleDemo.html \--\>`

`\<html\>`  
\<head\>

\<title\>My first styled page\</title\>

\<link rel = \"stylesheet\" type = \"text/css\" href =
\"CssExternalStyleSheet.css\" /\>

\<style type = \"text/css\"\>

p {color: blue; font-size: 16pt}

\</style\>  
\</head\> \<body\>

\<h1\>My First Styled Page\</h1\>

\<p\>Welcome to \<em\>CSS\</em\>\</p\>

\<p style = \"font-size: 12pt\"\>Welcome to HTML\</p\>  
\</body\>

`\</html\>`

![](media/image3.jpeg){width="3.4930555555555554in"
height="2.053472222222222in"}

**Figure 3**

*The mixed styles in Listing 5 is rendered by a Web browser.*

The style for the `\<h1\>` tag in line 16 is defined in the
external style sheet. The style for the \<p\> tag in line 17 is defined
in the external style sheet as [p {color: red}]{.underline}

and in the document style sheet as

[p {color: blue; font-size: 16pt}]{.underline}

So they are cascaded into

[p {color: blue; font-size: 16pt}]{.underline}

The style for the \<p\> tag in line 18 is defined in the external style
sheet, in the document style, and in the inline style. They are cascaded
into [p {color: blue; font-size: 12pt}]{.underline}

The `\<em\>` tag in line 17 is embedded in the
`\<p\>` tag. So, the © Copyright Y. Daniel Liang, 2005 8

style properties for the \<p\> tag are inherited by this \<em\> tag. The
cascaded style for `\<em\>` is

[em {color: black; background-color: yellow; color: blue; font-size:
12pt}]{.underline}

**6 Fonts**

***\<Side Remark: font properties\>***

You can use properties `font-family`,
`font-size`, `font-weight`, and
`font-style` to specify a font name, size, weight, and
style.

***\<Side Remark: generic family name\>***

There are a lot of fonts out there, but not all the computers support
these fonts. However, all the browsers support the generic fonts:
`serif, sans-serif, monospace, cursive, fantasy`

You may use these generic fonts as an alternative if a font is not
supported in a system. For example, the following rule tells the browser
to use the `Courie New` font for the p element. If the font
is not supported, use the generic `monospace` font.

[p {font-family: \"Courier New\", monospace}]{.underline}

***\<Side Remark: font size\>***

Two types of measurements, *absolute* and *relative*, can be used to
specify a font size. Absolute measurements are fixed on browsers and
cannot be resized by the user. Relative measurements vary on browsers.
Using a relative font size gives the user flexibility to choose display
size.

***\<Side Remark: absolute measurement\>***

The units for absolute measurements are px (pixel), `in`
(inches), `cm` (centimeters), `mm`
(millimeters), `pt` (points; 1 pt = 1/72 in), and
`pc` (picas; 1 pc = 12 pt).

***\<Side Remark: relative measurement\>***

You can use relative values (`xx-small`,
`x-small`, `small`, `smaller`,
`medium`, `large`, `larger`,
`x-large`, and `xx-large`) to specify the font
size. The actual size is determined by the browser's default font size,
which can be set by a browser user. Other relative measurements are
represented in percentages of `em` and ex. `em`
is the height of the uppercase letter M in a given font. ex is the
height of lowercase x in a give font.

**TIP**

***\<side remark: relative measurements preferred\>***  
Since the relative measurements give user more flexibility than the
> absolute measurements, the relative measurements are preferred. Font
> size in relative measurement can be resized in a browser, but cannot
> be size if absolute measurement is used.

**CAUTION**

***\<side remark: mixed measurements\>***  
Listing 6 mixes various measurements. It uses em, `ex`,
> and `in`. These measurements may be different on different
> system. It is better to consistently use one measurement for one page.

***\<Side Remark: font-style\>***

The `font-style` property can be used to specify whether the
font is italic. Three possible values are `normal`,
`italic`, and `oblique`.

***\<Side Remark: font-weight\>***

The `font-weight` property can be used to specify whether
the font is bold. Three possible values are `bolder`,
`bold`, and `lighter`.

***\<Side Remark: font-variant\>***

The `font-variant` property can be used to specify the font
is in normal or small-caps.

***\<Side Remark: shorthand font property\>***

You can use the shorthand `font` property to set all the
properties for a font in one declaration in the order of font-style,
font-variant, font-weight, font-size, and font­family. For example, the
following statement

[p {font: italic small-caps bold 1em \"Courier New\"
monospace}]{.underline} declares that the p element is displayed in
italic, small­caps, bold, size of 1em, Courier New (primary font), and
monospace (secondary font).

Listing 6 gives an example that demonstrates the font properties, as
shown in Figure 3. The font size for `h3`, `h4`,
and `h5` are specified using relative measurements in lines
9­14. The font size for i and em are specified using absolute
measurements in lines 15-16. If you change the default font size in the
browser, the `h3`, `h4`, and `h5`
element size changes, but the i and em font size does not change. Line
19 uses the `font` property to specify font-style,
font-variant, font-weight, font-size, and font-family in one
declaration.

**Listing 6 cssFontDemo.html (Font Sizes)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks, A.***

***\<Side Remark line 9: relative em size\>***

***\<Side Remark line 12: relative ex size\>***

***\<Side Remark line 13: absolute size\>***

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}  
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>

`\<!\-- cssFontDemo.html \--\>`

`\<html\>`  
\<head\>

\<title\>Using Style Class\</title\>

\<style type = \"text/css\"\>

h3 {font-family: Courier, monospace; font-size: 2em, font-weight: bold;
color: navy}

h4 {font-family: \"Times New Roman\", sans-serif; font-size: 1.5em;
font-style: italic; color: blue}

h5 {font-family: Arial, sans-serif; font-size: 1em; font-variant:
small-caps; color: green}

i {font-size: 0.5cm; color: blue}

em {font-size: 0.25in; color: orange}

p {font: italic small-caps bold 1em \"Courier New\" monospace}
\</style\>  
\</head\> \<body\>

\<h3\>Font Size Demo h3\</h3\>

\<h4\>Font Size Demo h4\</h4\>

\<h5\>Font Size Demo h5\</h5\>  
`\<p\>small-caps is used here`
>
> [\<i\>relative font size can be changed by a
> browser.\</i\>]{.underline}

\<em\>absolute font size cannot be changed by a browser.\</em\>\</p\>  
\</body\>

`\</html\>`

![](media/image4.jpeg){width="3.433333333333333in"
height="2.326388888888889in"}

**Figure 4**

*Listing 6 demonstrates font properties.*

**7 Text Alignments, Indents, and Decorations**

***\<Side Remark: text properties\>***

You can use properties text---align, `text-indent`, and
`text­decoration` to specify a text alignment, indent, and
decoration.

***\<Side Remark: text-align\>***

The `text-align` property can be used to specify whether the
text is left-aligned, centered, or right-aligned using the property
values `left`, `center`, and
`right`.

***\<Side Remark: `text-indent`\>***

The `text-indent` property indents the first line of text in
the element by the specified amount.

***\<Side Remark: text---decoration\>***

The `text-decoration` property specifies whether a text is
underlined, overlined, blink, or line-through using the values
`underline`, `overline`, `blink`,
and `line-through`. Note that `blink` is not
supported by Internet Explorer.

Listing 7 gives an example that demonstrates text alignment, indent, and
decoration, as shown in Figure 5. The `h3` element is
right-aligned and underlined (line 9). The `h4` element is
centered and overlined (line 10). The `h5` element is right-
aligned with line-through (line 11). The p element is indented 2em with
blink (line 12).

**Listing 7 cssTextPropertyDemo.html (Text Property Demo)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This***

***is true for all source code in the book. Thanks, A.***

***\<Side Remark line 9: right, underline\>***

***\<Side Remark line 10: center, overline\>***

***\<Side Remark line 11: left, line-through\>***

***\<Side Remark line 12: indent, blink\>***

\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\> [\<! \--
cssTextPropertyDemo.html\^-\>]{.underline}

`\<html\>`  
\<head\>

\<title\>Text Property Demo\</title\>

\<style\^ype\^\"text/css\"\>

h3 {text-align: right; text-decoration: underline} h4 {text-align:
center; text-decoration: overline} h5 {text-align: left;
text-decoration: line-through} p {text-indent: 2em; text-decoration:
blink}

\</style\>  
\</head\> \<body\>

\<h3\>Text Property Demo h3\</h3\>

\<h4\>Text Property Demo h4\</h4\>

\<h5\>Text Property Demo h5\</h5\>

\<p\>You can use properties text-align, text-indent, and text-decoration
to specify a text alignment, indent, and decoration.\</p\>  
\</body\>

`\</html\>`

**3 Text Property Demo - Microsoft Internet Explorer**

File Edit View Favorites Tools Help

Address C:\\book\\cssTextPropertyDemo.html  
**`Text Property Demo h3`**
>
> **Text Property Demo h4**

**~~T~~ext ~~Pro~~pert~~y D~~e~~mo~~ h5**  
You can use properties text-align. text-indent, and text-dec oration
> to specify a text alignment, indent, and decoration.

**My Computer**

**Figure 5**

*Listing 7 demonstrates text properties.*

8.  **Padding, Border, and Margin**

***\<Side Remark: text properties\>***

You can specify the width of four sides of the padding, border, and
margin for each element, as shown in Figure 6.

![](media/image5.png){width="2.6534722222222222in"
height="0.8131944444444444in"}

*Each element has padding, border, and margin.*

***\<Side Remark: padding properties\>***

***\<Side Remark: margin properties\>***

The properties for padding are `padding-bottom`,
`padding-left`, `padding-right`, and
`padding-top`. The properties for margin are
`margin-bottom`, `margin-left`,
`margin-right`, and `margin- top` . You can use
the shorthand properties `padding` and `margin`
to set all of the padding and margin properties. For example, the
following statement

[p {padding-bottom: 0.2em; padding-top: 0.2em}]{.underline} declares the
p element with bottom padding 0.2em and top padding 0.2em.

The following statement [b {margin-left: 0.3em; margin-right:
0.3em}]{.underline}

declares the b element with left margin 0.3em and right margin 0.3em.

The following statement [hl {padding: 0.2em 0.2em 0.2em 0.2em; margin:
0.3em 0.3em 0.3em 0.3em}]{.underline}

declares the `hl` element with padding 0.2em on all four
sides and margin 0.3em on all four sides.

***\<Side Remark: relative width values\>***

You can use relative measurements (e.g., em, ex) and absolute
measurements (e.g., cm, mm) to specify the width of padding, border, and
margin. You may also use the relative values thin, medium, and thick to
specify the width.

***\<Side Remark: border properties\>***

You can specify the width of a border using the properties
`border-bottom-width`, `border-left-width`,
`border-right-width`, and `border-top-width`.
Additionally, you can specify the color and style for a border using the
properties: `border­bottom-color` ,
`border-left-color`, `border-right-color`,
`border- top-color` , `border-bottom-style`,
`border-left-style`, `border­right-style`, and
`border-top-style`. The values for the style are
`dotted`, `dashed`, `solid`,
`double`, `groove`, `ridge`,
`inset`, and `outset`. The default value is
`solid`.

***\<Side Remark: shorthand border properties\>***

You can use shorthand properties `border-left`,
`border-right`, `border-top`,
`border-bottom` to specify the side width, style, and color
in one declaration. You can also use the shorthand property
`border` to specify `border-width`,
`border-style`, and `border-color`. For example,
the following statement

[p {border-left: 0.2em dotted red}]{.underline}

declares the p element with red dotted border width 0.2em on left side.

For example, the following statement [p {border: thin dotted
red}]{.underline}

declares the p element with thin dotted red border on all four sides.

Listing 8 gives an example that demonstrates padding, border, and
margin, as shown in Figure 7. The `h3` element

(lines 9-10) is surrounded by 0.2em padding, 0.1em margin, with dashed
blue border. The `h4` element's top and bottom padding is
0.2em, with double green border (lines 11-12). The `h5`
element's left and right margin is 0.5em, with solid border (lines
13-14). The p element's border is 0.1em, with dotted red border (line
15).

**Listing 8 cssPaddingBorderMarginDemo.html (Padding, Border, and Margin
Demo)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks, A.***

***\<Side Remark line 9: padding\>***

***\<Side Remark line 10: margin, border\>***

***\<Side Remark line 11: left, line-through\>***

***\<Side Remark line 15: border\>***

\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\> [\<!\--
cssPaddingBorderMarginDemo.html \--\>]{.underline}

`\<html\>`  
\<head\>

\<title\>Padding, Border, and Margin Demo\</title\>

\<style type = \"text/css\"\>

h3 {padding: 0.2em, 0.2em, 0.2em, 0.2em, margin: 0.1em, 0.1em, 0.1em,
0.1em; border: dashed blue} h4 {padding-bottom: 0.2em; padding-top:
0.2em;

border: double green}

h5 {margin-left-width: 1em; margin-right-width: 0.5em; border: solid}

p {border: 0.1em 1em 1em 0.1em dotted red}

\</style\>  
\</head\>
>
> \<body\>

\<h3\>Padding, Border, and Margin Demo h3\</h3\>

\<h4\>Padding, Border, and Margin Demo h4\</h4\>

\<h5\>Padding, Border, and Margin Demo h5\</h5\>

\<p\>You can specify padding, border, and margin properties on any
elements.\</p\>  
\</body\>

`\</html\>`

![](media/image6.jpeg){width="3.4069444444444446in"
height="2.359722222222222in"}

*Listing 8 demonstrates padding, border, and margin.*

9.  **Dimensions and Line Spacing**

***\<Side Remark: width\>***

***\<Side Remark: `height`\>***

You can specify the width and height of an element using the
`width` and `height` properties, as shown in
Figure 8.

4\
height\
.1.  
width

**Figure 8**

*You can specify the width and height of an element.*

You can also specify the space between two lines using the
`line-height` property.

Listing 9 gives an example that demonstrates element dimensions and line
spacing, as shown in Figure 9. The `h3` element has a dashed
blue border with height 6em and width 12em (line 9). The p element has a
solid red border with height 2em, width 5em, and line-spacing 1.5em
(lines 10-11).

**Listing 9 cssDimensionSpacingDemo.html (Element Dimensions and Line
Spacing) *\*\*\*PD: Please add line numbers (including space lines) in
the following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks, A.***

***\<Side Remark line 9: element dimension\>***

***\<Side Remark line 11: line spacing\>***

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}  
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>

`\<!\-- cssDimensionSpacingDemo.html \--\>`

`\<html\>`  
\<head\>

\<title\>Element Dimensions and Line Spacing\</title\>

\<style type = \"text/css\"\>

h3 {border: dashed blue; height: 6em; width: 12em} p {border: 0.1em 1em
1em 0.1em solid red;

height: 2em; width: 5em; line-height: 1.5em}

\</style\>  
\</head\>
>
> \<body\>
>
> \<h3\>Element Dimensions and Line Spacing\</h3\>
>
> \<p\>It a small world after all\</p\>
>
> \</body\>
>
> \</html\>

![](media/image7.jpeg){width="3.2597222222222224in"
height="2.553472222222222in"}

**Figure 9**

*Listing 9 demonstrates element dimensions and line spacing.*

10. **CSS Selectors**

The selectors in the style sheets in the preceding sections are single
elements. CSS enables you to specify selectors in many ways. This
section introduces universal selectors, class selectors, specific class
selectors, ID selectors, descendant selectors, and grouping selectors.

***\<Side Remark: universal selector*** [^1]***\>***

The universal selector, denoted by \*, specifies that a style is applied
to all the elements in the document. For example, specifies that the
background for all elements is white.

***\<Side Remark: class selector \*\>***

You can define a style class and apply it to any type of elements, as
shown in line 9 in Listing 9. Line 9 declares a style class named
*highlight*, which sets the background to yellow. Style class
declarations are preceded by a period. The style class
`highlight` is applied to the p element in line 16.

***\<Side Remark: specific class selector \*\>***

A style class can be declared to apply to a *specific type* of element,
as shown in line 10 in Listing 9. Line 10 declares a style class named
*redhighlight*, which sets the background to red. This style class is
only applicable for the em element. The style class
`highlight` is applied to the em element in line 18.

Listing 10 is displayed as shown in Figure 9.

**Listing 10 cssClassSelectorDemo.html (Using Style Class)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks, A.***

***\<Side Remark line 7: style class\>***

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}  
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>

`\<!\-- cssClassSelectorDemo.html \--\>`

`\<html\>`  
\<head\>

\<title\>Class Selector Demo\</title\>

\<style type = \"text/css\"\>

.highlight {background-color: yellow} em.redhighlight {background-color:
red}

\</style\>  
\</head\>
>
> \<body\>

\<h1\>Class Selector Demo\</h1\>

\<p class = \"highlight\"\>Learn how to use a style class.\</p\>

\<p\>Style class can be applied to

\<em class = \"redhighlight\"\>any type of element\</em\>.\</p\>  
\</body\>

`\</html\>`

![](media/image8.jpeg){width="3.459722222222222in"
height="2.3333333333333335in"}

**Figure 9**

*Listing 10 demonstrates using class selectors.*

***\<Side Remark: id selector\>***

An *ID selector* defines a style class using an ID. For example, the
following code defines a style using an ID named unique.

[#unique {background-color: yellow}]{.underline}

The following code applies the ID selector in the h3 element:

`\<h3 id = \"unique\"\> Unique Selector Demo\</h3\>`

***\<Side Remark: descendant selector\>***

A *descendant selector* specifies a selector that is applied to a child
of an element. For example, the following code defines a descendant
style for the `li` element. All child elements of
`li` are displayed in color red.

[li \* {color: red}]{.underline}

The following code is an example that uses the descendant selector:

\<ul\>  
\<li\>\<em\>Java\</em\>\</li\>
>
> \<li\>\<em\>CSS\</em\>\</li\>

`\</ul\>`

You may specify a child element in the descendant selector. For example,
the following style applies to the em element under `li`.

[li em {color: red}]{.underline}

***\<Side Remark: grouping selectors\>***

© Copyright Y. Daniel Liang, 2005

If multiple selectors have the same style, they can be grouped. For
example, the following code groups the style for the elements
`h1`, `h2`, and `h3`.

[h1, h2, h3 {background-color: yellow}]{.underline}

11. **CSS Pseudo-Classes**

CSS pseudo-classes are used to add special effects to some selectors.
The syntax for pseudo-classes is:

[selector:pseudo-class {property1: value1; \...; propertyn:
valuen}]{.underline}

***\<Side Remark: anchor pseudo-classes\>***

You can use the pseudo-classes `link`,
`visited`, `hover`, and `active` to
specify desired effects on the anchor hyperlink tag, as shown in Listing
11. The hyperlink is displayed in green and bold before it is visited
(line 9). After it is visited, it is displayed in blue and bold (line
10). When you move the mouse over the link, the link appears in red and
bold (line 11). After it is selected, it is displayed in navy and bold
(line 12).

**Listing 11 cssPseudoClassDemo.html (Using Pseudo Class)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code***[^2]

***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks, A.***

***\<Side Remark line 9: pseudo class link\>***

***\<Side Remark line 10: pseudo class visited\>***

***\<Side Remark line 11: pseudo class `hover\>`***

***\<Side Remark line 12: pseudo class `active`\>***

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}

`\^\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>`
`\<! \-- cssPseudoClassDemo.html\^-\>`

`\<html\>`  
\<head\>

\<title\>Using CSS Pseudo Classes\</title\>

\<style type = \"text/css\"\>

a:link {color: green; font-weight: bold} /\* unvisited link \*/
a:visited {color: blue; font-weight: bold} /\* visited link \*/ a:hover
{color: red; font-weight: bold} /\* mouse over link \*/ a:active {color:
navy; font-weight: bold} /\* selected link \*/

\</style\>  
\</head\>
>
> \<body\>

\<h3\>Using CSS Pseudo Classes\</h3\>  
to access the companion Website for the book.\</p\> \</body\>
>
> \</html\>

![](media/image9.jpeg){width="3.2333333333333334in"
height="1.6069444444444445in"}

**Figure 10**

*Listing 11 demonstrates using pseudo classes.*

Pseudo-classes can be combined with CSS classes. For example, the
following declaration combines CSS class `a.red` with
pseudo-class `visited`.

[a.red:visited {color: red}]{.underline}

It can be used as follows:

[\<a class = \"red\" href = \"somefile.html\"\>A
hyperlink\</a\>]{.underline}

12. **`span` and `div` Elements**

Sometimes you want to apply styles on the content which is not
appropriate using any HTML tags, because HTML tags (e.g.,
`h1`, p, em, i, etc) have their inherent styles. You can use
`span` and `div`, which do not have inherent
styles. For example,

`\<span style = \"color: red\"\>red\</span\>`

`\<div style = \"color: red; font-size: 1em\"\>red\</div\>`

`\<span\>` and `\<div\>` are almost identical
except that each element in the `\<div\>` tag is displayed
on its own line.

Listing 12 displays the `\<span\>` and `\<div\>`
elements, as shown in Figure 11. Two `\<span\>` elements are
given in lines 11-12 and they are displayed on the same line. Two
`\<div\>` elements are given in lines 13-14 and they are
displayed on their separate lines.

**Listing 12 cssSpanDivDemo.html (Using \<span\> and \<div\>)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks, A.***

  -------------- ----------------- ------------ ----------- -------------------
  ***\<Side***   ***Remark***      ***line***   ***11:***   ***\<span\>\>***

  ***\<Side***   ***Remark***      ***line***   ***12:***   ***\<span\>\>***

  ***\<Side***   ***Remark***      ***line***   ***13:***   ***\<div\>\>***

  ***\<Side***   ***Remark***      ***line***   ***14:***   ***\<div\>\>***
  -------------- ----------------- ------------ ----------- -------------------

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}  
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>

`\<!\-- cssSpanDivDemo.html \--\>`

`\<html\>`  
\<head\>

\<title\>Using&lt;span&gt;and&lt;div&gt;Elements\</title\>  
\</head\>
>
> \<body\>

\<span style = \"color: red\"\>red\</span\>

\<span style = \"color: green\"\>green\</span\>

\<div style = \"color: red; font-size: 2em\"\>red\</div\>

\<div style = \"color: green; font-size: 2em\"\>green\</div\>  
\</body\>

`\</html\>`

**3 Using \<span\> and \<div\> Elements - Microsoft Internet**

`File Edit View Favorites Tools Help` \|

Q Back ▼ Q ▼ \[x\] ® \| \[£) Search Favorites \| \*

Address \|@ C:\\book\\cssSpanDivDemo.html (3 Go \| Links " \|

red green

red

green \|

Done \| \| \| My Computer

**Figure 11**

*Listing 12 demonstrates using `\<span\>` and \<div\>.*

13. **CSS Lists**

You can use lists in HTML. CSS lists provide more features than HTML
lists. CSS lists enable you to place the list-item marker, change
between different list-item markers, or set an image as the list-item
marker.

***\<Side Remark: list-style-image\>***

You can use the `list-style-image` property to specify an
image marker. For example, the following code displays a list with three
different image markers, as shown below:

\<ul\>

\<li style = \"list-style-image: url(\'image/usIcon.gif\')\"\>US\</li\>

\<li style = \"list-style-image:
url(\'image/caIcon.gif\')\"\>Canada\</li\>

\<li style = \"list-style-image:
url(\'image/chinaIcon.gif\')\"\>China\</li\>

\</ul\>

The image is specified using the syntax `url(\'filename\')`.

***\<Side Remark: list-style-position\>***

You can use the `list-style-position` property to specify
where the list-item marker is placed. The values are
`inside` and `outside` (default). For example,
the following code displays a list with three different image markers
and the first and the third are placed inside and the second is placed
outside as shown below:

\<ul\>

\<li style = \"list-style-image: url(\'image/usIcon.gif\');

list-style-position: inside\"\>US\</li\>

\<li style = \"list-style-image: url(\'image/caIcon.gif\');

list-style-position: outside\"\>Canada\</li\>

\<li style = \"list-style-image: url(\'image/chinaIcon.gif\');

list-style-position: inside\"\>China\</li\>

\</ul\>

***\<Side Remark: list---style---type\>***

You can use the `list-style-type` property to specify the
type of the list-item marker. The values are `none`,
`disc` (default), `circle`,
`square`, `decimal`, `lower-roman`,
`upper­roman`, `lower-alpha`, and
`upper-alpha`.

***\<Side Remark: `list-style` shorthand\>***

You can also use the shorthand `list-style` property to
specify `list-style-type`,
`list-style-position`, and `list­style-image` in
one declaration.

Listing 13 demonstrates using CSS list properties, as shown in Figure
12.

**Listing 13 cssListDemo.html (Using CSS Lists)**

***\*\*\*PD: Please add line numbers (including space lines) in the
following code\*\*\****

***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks, A.***

***\<Side Remark line 8: list style properties\>***

***\<Side Remark line 18: ID selector\>***

[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}  
\"[http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd^11^\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<!\-- cssListDemo.html
\--\>]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\<html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\<head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<style type
=\"text/css\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#upperroman {list-style-type: upper-roman; background-color:
cyan}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#upperalpha {list-style-type:
upper-alpha;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[color: red}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#decimal {list-style-type: decimal; list-style-position:
inside}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#mylist {list-style: square inside url(\"image/usIcon.gif\")
}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</style\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<ul id =
\"upperroman\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>US\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>Canada\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>China\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</ul\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<ul id =
\"upperalpha\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>US\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>Canada\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>China\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</ul\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<ul id =
> \"decimal\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>US\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>Canada\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>China\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</ul\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<ul id =
\"mylist\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>New
York\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>Denver\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>Atlanta\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</ul\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\</html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[![](media/image10.jpeg){width="3.079861111111111in"
height="3.3465277777777778in"}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Figure 12**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[*Listing 13 demonstrates using CSS
lists.*](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

14. 

`**The [float` Property**You can the `float`
property to specify where an image or a text will appear in another
element. The possible values are `left`,
`right`, and `none`
(default).](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Listing 14 gives an example that floats an image to the right and
floats the first letter of a paragraph to the left, as shown in Figure
13. The style](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\"float:
right\"]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[in line 12 specifies that the image is floated to the right. The
style](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\"float: left; font-size: 500%; line-height: 8
0%\"]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[in lines 14-15 specifies that the letter T is floated to the left with
500% font size and 80% font
height.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Listing 14 cssFloatDemo.html (Using float
Property)**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*PD: Please add line numbers (including space lines) in the
following
code\*\*\****](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks,
A.***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 12: float
right\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 14: float
left\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<!\-- cssFloatDemo.html
\--\>]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\<html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\<head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<title\>Using\^he
float\^roperty\</title\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<h3\>The Maple Leaf
flag\</h3\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div\>\<img style = \"float: right\" src = \"image/ca.gif\" width =
\"90\" height = \"60\"
/\>\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<p\>\<span style = \"float: left; font-size: 50
0%;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[line-height: 80%\"\>T\</span\>he Canadian National Flag was adopted by
the Canadian
Parliament](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[on October 22, 1964 and was proclaimed into law by Her Majesty Queen
Elizabeth II (the Queen of Canada) on February 15, 1965. The Canadian
Flag (colloquially known as The Maple Leaf Flag) is a red flag of the
proportions two by length and one by width, containing in its center a
white square, with a single red stylized eleven-point mapleleaf centered
in the white square.\</p\> \</body\>\
](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</html\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[![](media/image11.jpeg){width="3.1in"
height="2.1534722222222222in"}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Figure 13**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`*Listing 14 demonstrates using the [float`
property.*](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`***\<Side Remark: [clear`
property\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`You can also use the [clear` property to specify the side
(`left`, `right`, `both`,
`none`) where a float element is not allowed. For example,
if you replace the \<p\> tag in line 14
with](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<p style = \"clear:
right\"\>]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[The floating image is not allowed on the left, as shown in Figure
14.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[![](media/image12.jpeg){width="4.0in"
height="2.066666666666667in"}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Figure 14**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[*Image is not allowed to float on the
left.*](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

15. 

`**The [display` Property**You can the `display`
property to specify how and if an element is displayed. Three frequently
used values are `none block` (default), and
`inline`. The `none` value indicates that the
element will not be displayed. The `block` value indicates
that the element will be displayed as a block-level element, with a line
break before and after the element. The `inline` value
indicates that the element will be displayed as an inline element, with
no line break before or after the element. Listing 15 gives an example
that uses the `display` property to display a list
horizontally, as shown in Figure
15.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Listing 15 cssDisplayPropertyDemo.html (Using float
Property)**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*PD: Please add line numbers (including space lines) in the
following
code\*\*\****](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*Layout: Please layout exactly. Don't skip the space.
This***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***is true for all source code in the book. Thanks,
A.***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 8: display
inline\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 14: float
left\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<!\-- cssDisplayPropertyDemo.html
\--\>]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\<html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\<head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<title\>Using the display
Property\</title\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<style\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[li {display: inline; padding: 1em; color:
red}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</style\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</head\>
> \<body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<ul\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>Georgia\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>Oklahoma\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>Indiana\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</ul\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\</html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[![](media/image13.jpeg){width="3.026388888888889in"
height="1.1736111111111112in"}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Figure 15**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`*Listing 15 demonstrates using the [display`
property.*](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`***\<Side Remark: [clear`
property\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`The style for the [li` selector is specified
as](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[li {display: inline; padding: 1em; color:
red}]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[So the list items are displayed consecutively without line
breaks.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**16 Relative and Absolute
Positions**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[The CSS position properties can be used to position an element. You can
position an element relative (left, right, top, and bottom) to its
normal position or position an element using an absolute value. Listing
16 gives an example that demonstrates several useful position
properties. The example is displayed in Figure
16.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[**Listing 16 cssPositionDemo.html (Using Position
> Properties)**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*PD: Please add line numbers (including space lines) in the
following
code\*\*\****](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*Layout: Please layout exactly. Don't skip the space.
This***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***is true for all source code in the book. Thanks,
A.***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 10: absolute
position\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 16: relative
position\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 19: relative
position\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 26: relative
position\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 38:
overflow\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
> Strict//EN\"]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [[\<!\-- cssPositionDemo.html \--\>
> \<html\>]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<title\>CSS Position
> Demo\</title\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</head\>
> \<body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<div style = \"position: absolute; left: 24em; top:
> 16em\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [This line is placed using absolute
> position\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<div style = \"border: solid; margin-top: 1em; padding:
> 1em\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<div style = \"color: red\"\>This line is in normal
> position](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<div style = \"position: relative; left: 1em; color: green\"\> This
> line is 1em left of its normal
> position](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<div style = \"position: relative; right: 1em; color: blue\"\> This
> line is 1em right of its normal
> position](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<div style = \"border: solid; margin-top: 1em; padding:
> 1em\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<div style = \"color: red\"\>This line is in normal
> position](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<span style = \"position: relative; top: -1em; color: green\"\> This
> line is 1em higher than its normal
> position](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</span\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<div style = \"color: red\"\>This line is in normal
> position](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<span style = \"position: relative; top: 1em; color: green\"\> This
> line is 1em lower than its normal
> position](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</span\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div style = \"border: solid; margin-top: 1em; padding: 1em; width: 2
0em; height: 5em; overflow:
scroll\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[The overflow property decides what to do if the content inside an
element exceeds the given width and height
properties.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</html\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[![](media/image14.jpeg){width="4.493055555555555in"
height="2.9in"}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Figure 16**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[*Listing 15 demonstrates using the position
properties.*](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`Line 10 [position: absolute; left: 24em; top: 16em;`
specifies absolute position for the text. The text is placed at 24em
from the left border and 16em from the top
border.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`Line 16 [position: absolute; left: 24em; top: 16em;`
specifies that the element is 1em left relative to the normal
position.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Line 19](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[position: relative; right:
1em;]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[specifies that the element is 1em right relative to the normal
position.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`Line 26 [position: relative; top: -1em;` specifies that the
element is 1em higher than the normal
position.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Line 31](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[position: relative; top:
1em;]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[specifies that the element is 1em lower than the normal
position.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`Line 38 [overflow: scroll` uses the `overflow`
property. This property specifies what to do if the content inside an
element exceeds the given width and
height.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`***\<Side Remark: [z-index`
property\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`You can use the [z-index` property to place an element in
the front or back of another element. Listing 17 demonstrates how to
place a text before and behind an image, as shown in Figure 17. Line 12
z-index: -1](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[specifies that the image is placed behind the
text.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Line 17](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[z-index:
1]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[specifies that the image is placed before the
text.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Listing 17 cssZIndexDemo.html (Using
Z-Index)**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*PD: Please add line numbers (including space lines) in the
following
code\*\*\****](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks,
A.***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 12: behind
text\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 17: before
text\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<! \-- cssZ
IndexDemo.html\^-\>]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\<html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\<head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<title\>Using the z-index
Property\</title\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<span\>\<img style = \"position: absolute; left: 2em; top: 2em;
z-index: -1\" src = \"image/ca.gif\" width = \"90\" height = \"60\"
/\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[The Canadian National
Flag\</span\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<span\>\<img style = \"position: relative; left: 6em; top: 1em;
z-index: 1\" src = \"image/ca.gif\" width = \"90\" height = \"60\"
/\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[The Canadian National
Flag\</span\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</body\>\
> ](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</html\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[![](media/image15.jpeg){width="4.006944444444445in"
height="1.6201388888888888in"}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Figure 17**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`*The [z-index` property can be used to place text in front
of image.*](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**17 Replacing Frames Using
CSS**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[You can use HTML frames to divide a page into header, left, and right
panes. But it is easier and more convenient to create frames using CSS.
Listing 18 gives an example that creates a frame with header pane, left
pane, center pane, and bottom pane, as shown in Figure
18.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Listing 18 cssFrameDemo.html (Creating Frames Using
CSS)**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*PD: Please add line numbers (including space lines) in the
following
code\*\*\****](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*Layout: Please layout exactly. Don't skip the space.
This***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***is true for all source code in the book. Thanks,
A.***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  -------------------------------------------------------------- ------------------------------------------------------------------
  [***\<Side Remark line                                         [***declare header
  8:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)    id\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***declare left
  10:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   id\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***declare center
  13:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   id\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***declare bottom
  15:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   id\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***declare active
  18:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   id\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***style for
  19:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   \<a\>\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***header
  25:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   pane\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***left
  36:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   pane\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***use active
  38:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   id\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***center
  45:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   pane\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

  [***\<Side Remark line                                         [***bottom
  56:***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)   pane\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
  -------------------------------------------------------------- ------------------------------------------------------------------  
[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
> Strict//EN\"](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [[\<!\-- cssFrameDemo.html
> \--\>]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<html\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<title\>Creating Frames Using
> CSS\</title\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<style type =
> \"text/css\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [#header {text-align: center; padding-bottom:
> 0.5em;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [border-bottom: 0.2em solid
> red}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [#left {list-style-type: none; padding:
> 0;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [margin: 0; position: relative; top: 1em; left:
> 1em;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[width: 15%}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#center {position: relative; left: 10em; top: -5em; width: 70%; border:
1px red solid}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#bottom {position: relative; top: -4em; padding: 0.1em; text-align:
right; color: white; background-color: gray; clear:
left}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#active {color: red; border: red 1px
solid}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[a {text-decoration:
none}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</style\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<!\-- header pane
\--\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div id =
\"header\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Y. Daniel
Liang\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Department of Computer
Science\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Armstrong Atlantic State
University\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<!\-- left pane
\--\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\<div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<ul id = \"left\" style = \"line-height:
1.5em\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>\<a href = \"vita.html\"\>Vita\</a\>
\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>\<a id = \"active\" href =
\"courses.html\"\>Courses\</a\>\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>\<a href = \"books.html\"\>Books\</a\>
\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>\<a href = \"journals.html\"\>Journals\</a\>
\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</ul\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<!\-- center pane
\--\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div id =
\"center\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<h3 style = \"background-color: red; color:
white;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[text-align:
center\"\>Course\</h3\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div style = \"padding:
0.2em\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[CSCI 1301 Introduction to Java Programming\<br
/\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[CSCI 1302 Advanced Java Programming\<br
/\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[CSCI 3720 Introduction to Database
Systems](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<!\-- bottom pane
\--\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div id =
\"bottom\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Copyright &copy; 1997-2007 by Y. Daniel
Liang\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\</html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[![](media/image16.jpeg){width="3.946527777777778in"
height="2.473611111111111in"}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Figure 18**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[*You can emulate HTML frames using
CSS.*](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`The example declares id selectors [header`,
`left`, `center`, and `bottom` to
specify the position and size for header, left, center, and bottom panes
in lines 8-17. The left pane displays four
hyperlinks.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[The user can select contents from the left pane. Initially, the course
hyperlink is selected with an active id (declared in line 18) to denote
the border and color for a selected link (line 38). You can write the
page for displaying vita, books, and journals in the same
way.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**18 Creating a Horizontal
Menu**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[The preceding example creates the vertical menus on the left pane. It
is easy to create horizontal menus using
CSS.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Listing 19 gives an example that creates horizontal menus, as shown in
Figure 19.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Listing 19 cssHorizontalMenuDemo.html (Creating Horizontal
Menus)**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*PD: Please add line numbers (including space lines) in the
following
code\*\*\****](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks,
A.***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 9: horizontal
tabs\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 12: display
continuously\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<!\-- cssHorizontalMenuDemo.html
\--\>]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\<html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\<head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<title\>Creating Horizontal
Menus\</title\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<style\^ype=\"text/css\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#header {text-align: center; padding-bottom:
0.5em}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#tabs {width: 80%; margin-bottom: 1em; list-style-type:
none;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[border-bottom: 0.2em solid
red}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[li {display: inline; margin:
1em}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#center {width: 7 0%; text-align:
center;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[border: 1px red
solid}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#bottom {padding: 0.1em; width: 8 0%; margin-top:
1em;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[text-align: right; color: white; background-color: gray; clear:
left}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[#active {color: red; border: red 1px
solid}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[a {text-decoration:
none}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</style\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<!\-- header pane
\--\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div id =
\"header\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Y. Daniel
Liang\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Department of Computer
Science\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Armstrong Atlantic State
University\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<!\-- left pane
\--\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div style = \"text-align:
center\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<ul id = \"tabs\" style = \"line-height:
1.5em\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>\<a href = \"vita.html\"\>Vita\</a\>
\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>\<a id = \"active\" href =
\"courses.html\"\>Courses\</a\>\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>\<a href = \"books.html\"\>Books\</a\>
\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<li\>\<a href = \"journals.html\"\>Journals\</a\>
\</li\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</ul\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<!\-- center pane
\--\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div style = \"text-align:
center\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div id =
\"center\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<h3 style = \"background-color: red; color:
white;](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[text-align:
center\"\>Course\</h3\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div style = \"padding:
0.2em\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[CSCI 1301 Introduction to Java Programming\<br
/\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[CSCI 1302 Advanced Java Programming\<br
/\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[CSCI 3720 Introduction to Database
Systems](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<!\-- bottom pane
\--\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div style = \"text-align:
center\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<div id =
\"bottom\"\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[Copyright &copy; 1997-2007 by Y. Daniel
Liang](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</div\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\</body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\</html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[![](media/image17.jpeg){width="3.8534722222222224in"
height="2.073611111111111in"}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Figure 19**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[*You can create horizontal menus using
CSS.*](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`The [tabs` id (lines 9-10) declares a list and the
`li` selector (line
11)](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[li {display: inline; margin:
1em}]{.underline}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[specifies that the list items are displayed in the same
line.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[The user can select contents from the horizontal menu. Initially, the
course hyperlink is selected with an active id (declared in line 17) to
denote the border and color for a selected link (line 37). You can write
the page for displaying vita, books, and journals in the same
way.](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**19 CSS Media
Types**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[A document usually needs a larger font size than on paper. When you
print a Web document, often the fonts are too large. The media types can
be used to fix this problem. You can specify different styles for
different media using the \@media rule. For example, the following code
in Listing 20 tells the browser to display the document in a 14 pixels
Verdana font on the screen (lines 8-10) and print the document in a 10
pixels Times font (lines
12-14).](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[**Listing 20 cssMediaTypeDemo.html (Using CSS Media
Types)**](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*PD: Please add line numbers (including space lines) in the
following
code\*\*\****](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\*\*\*Layout: Please layout exactly. Don't skip the space. This is
true for all source code in the book. Thanks,
A.***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 9: horizontal
tabs\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[***\<Side Remark line 12: display
continuously\>***](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[[\<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0
Strict//EN\"]{.underline}
\"<http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd>\"\> [\<!\--
cssMediaTypeDemo.html \--\>]{.underline}
\<html\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\<head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<title\>Using &lt;span&gt; and &lt;div&gt;
Elements\</title\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<style\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\@media screen {](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[body {font-size: 14px; font-family: Verdana}
}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\@media print {](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[body {font-size: 10px; font-family: \"Times New Roman\"}
}](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\</style\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</head\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)
>
> [\<body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[\<!\-- body \--\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)  
[\</body\>](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

`[\</html\>`](http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd11)

[^1]: [{background-color: white}]{.underline}

[^2]: \<p\>Click the

    \<a href =
    \"[http://www.cs.armstrong.edu/liang/intro6e\"\>link\</a](http://www.cs.armstrong.edu/liang/intro6e%22%3elink%3c/a)\>
