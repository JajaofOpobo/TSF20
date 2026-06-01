uniform mat4 uMVPMatrix;      
attribute vec2 aTextureCoord;      
attribute vec4 aPosition;      
varying vec2 vTextureCoord;      
attribute vec4 aColor;      
varying vec4 vColor;      
void main() {      
gl_Position = uMVPMatrix * aPosition;      
 vTextureCoord = aTextureCoord;      
 vColor = aColor;      
}