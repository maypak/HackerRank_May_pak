import sys
import xml.etree.ElementTree as etree

def get_attr_number(node):
    n = len(node.attrib)
    for child in node:
        # print(child.tag, child.attrib)
        n += get_attr_number(child)
    return n

if __name__ == '__main__':
    sys.stdin.readline()
    xml = sys.stdin.read()
    tree = etree.ElementTree(etree.fromstring(xml))
    root = tree.getroot()
    print(get_attr_number(root))