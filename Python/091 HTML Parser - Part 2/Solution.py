from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_data(self, data):
        if data == '' or data == "\n":
            pass
        else:
            print(">>> Data", data, sep='\n')

    def handle_comment(self, data):
        splite = data.splitlines()
        if len(splite) == 1:
            print(">>> Single-line Comment", data, sep="\n")
        else:
            print(">>> Multi-line Comment", data, sep="\n")
  
html = ""       
for i in range(int(input())):
    html += input().rstrip()
    html += '\n'
    
parser = MyHTMLParser()
parser.feed(html)
parser.close()