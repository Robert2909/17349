FROM alpine
RUN apk add nginx
# RUN nginx
CMD ["nginx", "-g", "daemon off;"]
EXPOSE 80
# COPY C:/Users/alfre/17349/ordinario-ftw /var/lib/nginx/html
COPY ./ordinario-ftw /var/lib/nginx/html
COPY ./robert.conf /etc/nginx/http.d/default.conf
