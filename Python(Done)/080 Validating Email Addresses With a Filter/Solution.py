import re
def fun(s):
    # return True if s is a valid email, else return False
    pattern=re.compile("^[\\w-]+@[0-9a-zA-Z]+\\.[a-z]{1,3}$")
    for e in s:
        if pattern.match(s):
            return True
    return False
def filter_mail(emails):
    return list(filter(fun, emails))

if __name__ == '__main__':
    n = int(input())
    emails = []
    for _ in range(n):
        emails.append(input())

filtered_emails = filter_mail(emails)
filtered_emails.sort()
print(filtered_emails)