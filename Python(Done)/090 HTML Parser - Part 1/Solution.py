from html.parser import HTMLParser

class CustomHTMLparser(HTMLParser):
  def __printAttr(self, attrs):
    for attr in attrs:
      print(f"-> {attr[0]} > {attr[1]}")

  def handle_starttag(self, tag, attrs):
    print("Start :", tag)
    self.__printAttr(attrs)
    
  def handle_endtag(self, tag):
    print("End   :", tag)

  def handle_startendtag(self, tag, attrs):
    print("Empty :", tag)
    self.__printAttr(attrs)

def main():
  html = CustomHTMLparser()
  for _ in range(int(input())):
    html.feed(input())
    

if __name__ == "__main__":
  main()