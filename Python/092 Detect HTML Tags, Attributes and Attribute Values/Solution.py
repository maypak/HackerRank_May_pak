from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    
    def handle_starttag(self,tag,attrs ):
        print(tag)
        if len(attrs) > 0:
            for (k,v) in attrs:
                print("-> "+k+" > "+v)
        
        
html = ""

for i in range(int(input())):
    html += input().rstrip()
    html += "\n"
    
parser = MyHTMLParser()
parser.feed(html)
parser.close()