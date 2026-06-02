uniform mat4 uMVPMatrix;      
attribute vec2 aTextureCoord;      
attribute vec4 aPosition;      
varying vec2 vTextureCoord;      
attribute float aAlpha;      
varying float vAlpha;      
void main() {      
gl_Position = uMVPMatrix * aPosition;      
 vTextureCoord = aTextureCoord;      
vAlpha = aAlpha;      
}