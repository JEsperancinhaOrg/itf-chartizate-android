## Keystore steps

- Create a keystore

```shell
keytool -genkey -v -keystore ping2-release-key.keystore -alias JEsperancinhaORG -keyalg RSA -keysize 2048 -validity 1000000
```

>Validity for 1000000

- Create private key


```shell
java -jar pepk.jar --keystore=ping2-release-key.keystore --alias=JEsperancinhaORG --output=encrypted_private_key_path --rsa-aes-encryption --encryption-key-path=encryption_public_key.pem
````

>This step is only necessary when creating your own private key. Google can do that for you
