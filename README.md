# Item Duplicate Mod - Fabric 1.20.1

Um mod simples para Minecraft Java que permite duplicar itens apertando a tecla **Z**.

## Características

✅ **Duplicação com tecla Z** - Aperte Z para duplicar o item na mão principal
✅ **Client-side** - Funciona sem o mod instalado no servidor
✅ **Seguro** - Respeita limites de stack (máximo 64 itens)
✅ **Feedback visual** - Mensagens em tempo real no chat
✅ **Compatível** - Funciona com qualquer item

## Instalação

### Requisitos
- Fabric Loader 0.14.25+
- Fabric API 0.90.0+
- Minecraft 1.20.1

### Passos

1. Baixe o arquivo `.jar` compilado
2. Coloque na pasta `mods` (crie se não existir):
   - Windows: `%APPDATA%\.minecraft\mods`
   - Linux: `~/.minecraft/mods`
   - Mac: `~/Library/Application Support/minecraft/mods`
3. Inicie o Minecraft com o perfil Fabric

## Como Usar

1. Pegue um item qualquer
2. Aperte a tecla **Z**
3. O item será duplicado até atingir o limite de stack

## Exemplo

```
Você tem: 32 Diamantes na mão
Aperta Z
Agora tem: 33 Diamantes
```

## Compilar do Zero

```bash
# Clone o repositório
git clone https://github.com/RaioVerse/minecraft-duplicate-mod.git
cd minecraft-duplicate-mod

# Compile com Gradle
./gradlew build

# O JAR estará em: build/libs/duplicate-mod-1.0.0.jar
```

## Notas Importantes

⚠️ **Uso em Servidores**: Este é um mod client-side. Não causa danos à integridade do servidor, mas o admin pode não gostar. Use com cuidado!

📝 **Personalização**: Você pode modificar o código para:
- Mudar a tecla de atalho
- Duplicar múltiplos itens por vez
- Adicionar cooldown
- Restringir certos itens

## Licença

MIT
