def timeConversion(s):
    hour = int(s[:2])
    am_pm = s[-2:]
    if am_pm == "PM" and hour != 12:
        hour += 12
    elif am_pm == "AM" and hour == 12:
        hour = 0
    new_time = f"{hour:02}:{s[3:8]}"
    return new_time