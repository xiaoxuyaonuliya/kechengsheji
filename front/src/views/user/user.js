//获取用户列表
export function userList(data) {
    return request({
      url: '/user/list',
      method: 'post',
      data
    })
  }