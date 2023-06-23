FROM node:16-alpine
LABEL authors="subodhgujar"

WORKDIR /app

COPY package.json package-lock.json ./

RUN npm install

COPY . .

EXPOSE 8080

CMD ["npm", "run", "serve"]