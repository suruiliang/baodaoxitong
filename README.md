# bec-cloud-baodanxitong-web

# 1. 配置文件
1. 总入口，application.properties<br/>
设置启用生产（spring.profiles.active=prod）,还是开发（spring.profiles.active=dev）配置
2. 生产配置，application-prod.properties<br/>
3. 开发配置，application-dev.properties<br/>

# 2. 登录
- 手机号+验证码登录
- 用户名密码+验证码登录
- 用户名密码登录

### 2.1 手机号验证码登录

- 2.1.1 获取手机验证码

``` 
GET:
http://localhost:8081/code/sms?mobile=13605154259

Headers:
deviceId=13605154259
``` 

- 2.1.2 手机号+验证码登录

```
POST:
http://localhost:8081/authentication/mobile

Headers:
deviceId=13605154259
Authorization=Basic anNiZWM6YmVjMTIzNCE=

Body（form-data）：
mobile=13605154259
smsCode=123456
``` 

### 2.2 用户名密码+验证码登录
- 2.2.1 获取图片验证码

``` 
GET:
http://localhost:8081/code/image

Headers:
deviceId=13605154259
``` 

- 2.2.2 用户名密码+验证码登录

``` 
POST:
http://localhost:8081/authentication/form

Headers:
deviceId=13605154259
Authorization=Basic anNiZWM6YmVjMTIzNCE=

Body（form-data）：
username=13605154259
password=05154259
imageCode=1234
``` 

### 2.3 用户名密码登录

``` 
POST:
http://localhost:8081/oauth/token

Headers:
Authorization=Basic anNiZWM6YmVjMTIzNCE=

Body（form-data）：
username=13605154259
password=05154259
grant_type=password
``` 

# 3. 刷新token

``` 
POST:
http://localhost:8081/oauth/token

Headers:
Authorization=Basic anNiZWM6YmVjMTIzNCE=

Body（form-data）：
grant_type=refresh_token
refresh_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyU3RhdHVzIjoxLCJzeXNJZCI6MywidXNlcl9uYW1lIjoiMTM2MDUxNTQyNTkiLCJyb2xlSWQiOjcsInVzZXJJZCI6MzUsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJjbGllbnRfaWQiOiJqc2JlYyIsInJlYWxOYW1lIjoi5pyx5Zu95rK7Iiwic2NvcGUiOlsiYWxsIl0sImF0aSI6IjY3NmM2MjEzLWMyNWItNGIwMC1hMDRlLWQ2NzM5YTM5MTlmZiIsImN1c3RJZCI6MjEsImV4cCI6MTUyNTE0MDE2NywiaGVhZFBvcnRyYWl0IjpudWxsLCJqdGkiOiJiNzA4Yzg1OS1jMzIwLTQ5ZTMtYWQyZC05ZjI0N2IzOGQwYjcifQ.fh4rzXnty_K-2NGwWOsx0dSQXGHa4dvf6JKIMCa03sI
``` 

# 4. 正常请求
- Authorization方式
- access_token方式

###  4.1 Authorization方式
``` 
GET:
http://localhost:8081/user/me

Headers:
(bearer开头+一个空格+access_token)
Authorization=bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyU3RhdHVzIjoxLCJzeXNJZCI6MywidXNlcl9uYW1lIjoiMTM2MDUxNTQyNTkiLCJyb2xlSWQiOjcsInVzZXJJZCI6MzUsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJjbGllbnRfaWQiOiJqc2JlYyIsInJlYWxOYW1lIjoi5pyx5Zu95rK7Iiwic2NvcGUiOlsiYWxsIl0sImN1c3RJZCI6MjEsImV4cCI6MTUyNDUzOTQzNiwiaGVhZFBvcnRyYWl0IjpudWxsLCJqdGkiOiJlYjc0MjA0Yi0wMzljLTRjYjAtODg5Yy1hMmM4MzM4ZmRmOWYifQ.LzGkvqiN-q8BuoXJkjB53FmYLGHS1s6JMgb54RJubGg
``` 

### 4.2 access_token方式

``` 
GET:
http://localhost:8081/user/me?access_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyU3RhdHVzIjoxLCJzeXNJZCI6MywidXNlcl9uYW1lIjoiMTM2MDUxNTQyNTkiLCJyb2xlSWQiOjcsInVzZXJJZCI6MzUsImF1dGhvcml0aWVzIjpbIlJPTEVfVVNFUiJdLCJjbGllbnRfaWQiOiJqc2JlYyIsInJlYWxOYW1lIjoi5pyx5Zu95rK7Iiwic2NvcGUiOlsiYWxsIl0sImN1c3RJZCI6MjEsImV4cCI6MTUyNDUzOTQzNiwiaGVhZFBvcnRyYWl0IjpudWxsLCJqdGkiOiJlYjc0MjA0Yi0wMzljLTRjYjAtODg5Yy1hMmM4MzM4ZmRmOWYifQ.LzGkvqiN-q8BuoXJkjB53FmYLGHS1s6JMgb54RJubGg
``` 

# 5. 获取用户信息

``` 
SecurityUtils.getCurrentUserUsername();
``` 



