student={
    "name":["ashish","rohit","manish","kamlesh","vineet"],
    "math":[45,67,86,45,67],
    "english":[95,67,86,35,87],
    "hindi":[75,67,66,95,67]
}
sd={}
ts=len(student["name"])
for i in range(ts):
    total=student["math"][i]+student["english"][i]+student["hindi"][i]
    nm=student["name"][i]
    sd[nm]=total
names=list(sd.keys())
marks=list(sd.values())

print(marks,names)
for i in range(ts):
    max_marks=max(marks)
    ind=marks.index(max_marks)
    marks[ind]=-1
    print(names[ind])