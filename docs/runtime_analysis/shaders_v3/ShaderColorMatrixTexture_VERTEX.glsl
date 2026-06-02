uniform mat4 uMVPMatrix;      
uniform mat4 uSTMatrix;
attribute vec4 aTextureCoord;      
attribute vec4 aPosition;      
varying vec2 vTextureCoord;      
attribute vec4 aColor;      
varying vec4 vColor;      
void main() {      
gl_Position = uMVPMatrix * aPosition;      
 vTextureCoord = (uSTMatrix * aTextureCoord).xy;      
 vColor = aColor;      
}