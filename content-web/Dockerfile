FROM node:dubnium AS build
WORKDIR /usr/src/app
COPY package.json /usr/src/app/
RUN npm install
COPY . /usr/src/app
RUN npm run build

FROM nginx
RUN mkdir /app
COPY --from=build /usr/src/app/dist /app
COPY nginx.conf /etc/nginx/nginx.conf
